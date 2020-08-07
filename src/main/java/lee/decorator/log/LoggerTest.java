package lee.decorator.log;

import org.slf4j.Logger;
import org.slf4j.LoggerFactory;

import java.io.BufferedInputStream;
import java.io.FileInputStream;
import java.io.InputStream;

public class LoggerTest {


    //public static final Logger logger = LoggerFactory.getLogger(LoggerTest.class);
    public static final Logger logger = JsonLoggerFactory.getLogger(LoggerTest.class);

    public static void main(String[] args) {
        logger.error("模拟错误");


        try {
            InputStream in = new FileInputStream("");
            BufferedInputStream bis = new BufferedInputStream(in);
            bis.read();
            bis.close();

        }catch (Exception e){
            //logger.error(e);
            e.getStackTrace();
        }

    }
}
