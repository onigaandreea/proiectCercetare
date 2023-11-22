package org.example.withFactory;

class FileLogger implements Logger {
    @Override
    public void log(String message) {
        System.out.println("File Logger: " + message);
    }
}
