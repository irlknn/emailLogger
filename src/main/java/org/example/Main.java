package org.example;
import org.slf4j.Logger;
import org.slf4j.LoggerFactory;

public class Main {
    private static final Logger logger = LoggerFactory.getLogger(Main.class);
    public static void main(String[] args) {
        logger.error("Test error");
        logger.debug("Test debug");

        //delay to allow time for the request
        // to be processed
        try {
            Thread.sleep(5000);
        } catch (InterruptedException e) {
            logger.error("time error {}", e.getMessage());
        }
    }
}