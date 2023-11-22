package org.example.withoutObserver;

// Example without using design pattern
class Subject {
    public void notifyObservers(String message) {
        System.out.println("All observers received message: " + message);
    }
}
