package org.example.withFactory;

class ConsoleLoggerFactory extends LoggerFactory {
    @Override
    Logger createLogger() {
        return new ConsoleLogger();
    }
}
