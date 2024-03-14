package es.babel.McRonalds.utils;

import es.babel.McRonalds.McRonaldsApplication;
import org.apache.logging.log4j.LogManager;
import org.apache.logging.log4j.Logger;

public class LogUtils {

    public static final Logger logger = LogManager.getLogger(McRonaldsApplication.class);

    public static void logEror(String msg){
        logger.error(msg);
    }

    public static void logDebug(String msg){
        logger.debug(msg);
    }

    public static void logInfo(String msg){
        logger.info(msg);
    }

    public static void logWarn(String msg){
        logger.warn(msg);
    }

    public static void logFatal(String msg){
        logger.fatal(msg);
    }
}
