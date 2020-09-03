package io.jboxx.designpattern.observerpattern.implementation1;

public class ConcreteObserver1 implements IObserver {

    private IObservable observable;

    public ConcreteObserver1(IObservable observable) {
        this.observable = observable;
    }

    @Override
    public void update(IObservable observable) {
        System.out.println("Concrete Observer 1 got an update");
        if (observable instanceof ConcreteObservable) {
            System.out.println("State " + ((ConcreteObservable)observable).getState());
        }
    }
}
