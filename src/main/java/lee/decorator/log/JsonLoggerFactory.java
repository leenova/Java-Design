package lee.decorator.log;



import org.slf4j.Logger;
import org.slf4j.LoggerFactory;


public class JsonLoggerFactory  {

    public static JsonLoggerDecoreator getLogger(Class clazz){
        Logger logger = LoggerFactory.getLogger(clazz);
        return new JsonLoggerDecoreator(logger);
    }
}
