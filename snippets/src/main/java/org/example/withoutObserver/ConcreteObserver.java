package org.example.withoutObserver;

class ConcreteObserver implements Observer {
    @Override
    public void update(String message) {
        System.out.println("Observer received message: " + message);
    }
}
