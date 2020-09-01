package io.jboxx.designpattern.observerpattern;

public class ImplementationObserverPattern {

    public static void main(String[] args) {

        ConcreteObservable observable = new ConcreteObservable();

        ConcreteObserver1 observer1 = new ConcreteObserver1(observable);
        observable.add(observer1);

        ConcreteObserver2 observer2  = new ConcreteObserver2(observable);
        observable.add(observer2);

        try {
            Thread.sleep(1_500);
            observable.setState(ConcreteObservable.RUN_STATE);
        } catch (InterruptedException e) {
            e.printStackTrace();
        }


        try {
            Thread.sleep(1_500);
            observable.setState(ConcreteObservable.WALK_STATE);
        } catch (InterruptedException e) {
            e.printStackTrace();
        }

        try {
            Thread.sleep(1_500);
            observable.setState(ConcreteObservable.IDLE_STATE);
        } catch (InterruptedException e) {
            e.printStackTrace();
        }

        try {
            Thread.sleep(1_500);
            observable.setState(ConcreteObservable.WALK_STATE);
            observable.setState(ConcreteObservable.SIT_STATE);
        } catch (InterruptedException e) {
            e.printStackTrace();
        }
    }
}
