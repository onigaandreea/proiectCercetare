package org.example.withFactory;

public class FactoryMethodExample {
    public static void main(String[] args) {
        LoggerFactory consoleLoggerFactory = new ConsoleLoggerFactory();
        Logger consoleLogger = consoleLoggerFactory.createLogger();
        consoleLogger.log("Log message to console");

        LoggerFactory fileLoggerFactory = new FileLoggerFactory();
        Logger fileLogger = fileLoggerFactory.createLogger();
        fileLogger.log("Log message to file");
    }
}
