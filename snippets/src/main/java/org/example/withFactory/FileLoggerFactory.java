package org.example.withFactory;

class FileLoggerFactory extends LoggerFactory {
    @Override
    Logger createLogger() {
        return new FileLogger();
    }
}
