package io.jboxx.designpattern.observerpattern;

import java.util.HashSet;
import java.util.Set;
import java.util.concurrent.ConcurrentHashMap;

public interface IObservable {

    void add(IObserver observer);

    void remove(IObserver observer);

}
