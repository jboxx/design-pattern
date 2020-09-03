package io.jboxx.designpattern.observerpattern.implementation1;

public interface IObservable {

    void add(IObserver observer);

    void remove(IObserver observer);

}
