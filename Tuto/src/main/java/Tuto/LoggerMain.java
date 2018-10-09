package Tuto;

import org.apache.log4j.Logger;

public class LoggerMain {
    private static final Logger LOGGER = Logger.getLogger(App.class);
    public static void main(String[] args) {
        LOGGER.error("Hello World !");
    }
}
