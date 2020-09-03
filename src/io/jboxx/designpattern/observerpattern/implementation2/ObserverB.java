package io.jboxx.designpattern.observerpattern.implementation2;

import java.util.Observable;
import java.util.Observer;

public class ObserverB implements Observer {

    @Override
    public void update(Observable o, Object arg) {
        if (o instanceof LoginLogoutObservable) {
            System.out.println("isLoggedIn : " +
                    ((LoginLogoutObservable)o).isLoggedIn());
        }
    }
}
