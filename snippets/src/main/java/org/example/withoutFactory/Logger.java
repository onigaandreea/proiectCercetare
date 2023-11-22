package org.example.withoutFactory;

// Example without using design pattern
class Logger {
    void logToConsole(String message) {
        System.out.println("Console Logger: " + message);
    }

    void logToFile(String message) {
        System.out.println("File Logger: " + message);
    }
}

