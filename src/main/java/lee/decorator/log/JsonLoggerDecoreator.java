package lee.decorator.log;


import com.alibaba.fastjson.JSONObject;
import org.slf4j.Logger;

import java.util.Arrays;

public class JsonLoggerDecoreator extends LoggerDecorator {

    public JsonLoggerDecoreator(Logger logger) {
        super(logger);
    }

    public void error(String msg) {
        JSONObject jsonObject = new JSONObject();
        jsonObject.put("msg",msg);
        logger.error(jsonObject.toJSONString());
    }


    public void error(Exception e) {
        JSONObject jsonObject = new JSONObject();
        jsonObject.put("ex",e.getClass().getName());
        jsonObject.put("msg", Arrays.toString(e.getStackTrace()));
        logger.error(jsonObject.toJSONString());
    }

}
