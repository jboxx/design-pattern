package io.jboxx.designpattern.observerpattern.implementation1;

import java.util.HashSet;
import java.util.Set;

public class ConcreteObservable implements IObservable {

    public static final String IDLE_STATE = "Idle";
    public static final String SIT_STATE = "Sit";
    public static final String WALK_STATE = "Walk";
    public static final String RUN_STATE = "Run";

    private String state = IDLE_STATE;

    Set<IObserver> observers = new HashSet<>();

    @Override
    public void add(IObserver observer) {
        synchronized (this) {
            observers.add(observer);
        }
    }

    @Override
    public void remove(IObserver observer) {
        synchronized (this) {
            observers.remove(observer);
        }
    }

    public void notifyObservers() {
        Object[] arrLocal;
        synchronized (this) {
            arrLocal = observers.toArray();
        }

        for(int i = arrLocal.length-1; i >= 0; i--) {
            ((IObserver)arrLocal[i]).update(this);
        }
    }

    public String getState() {
        return state;
    }

    public void setState(String state) {
        this.state = state;
        notifyObservers();
    }
}
