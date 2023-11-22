package org.example.withoutObserver;

public class ObserverExample {
    public static void main(String[] args) {
        Subject nonObserverSubject = new Subject();
        Observer nonObserver1 = new ConcreteObserver();
        Observer nonObserver2 = new ConcreteObserver();

        nonObserverSubject.notifyObservers("Casual notification.");
    }
}
