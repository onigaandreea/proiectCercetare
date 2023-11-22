package org.example.withoutFactory;

public class Example {
    public static void main(String[] args) {
        Logger logger = new Logger();
        logger.logToConsole("Log message to console");
        logger.logToFile("Log message to file");
    }
}
