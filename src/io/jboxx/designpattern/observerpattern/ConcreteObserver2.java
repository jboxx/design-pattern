package io.jboxx.designpattern.observerpattern;

public class ConcreteObserver2 implements IObserver {

    private IObservable observable;

    public ConcreteObserver2(IObservable observable) {
        this.observable = observable;
    }

    @Override
    public void update(IObservable observable) {
        System.out.println("Concrete Observer 2 got an update");
        if (observable instanceof ConcreteObservable) {
            System.out.println("State " + ((ConcreteObservable)observable).getState());
        }
    }
}
