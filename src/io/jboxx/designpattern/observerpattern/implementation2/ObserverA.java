package io.jboxx.designpattern.observerpattern.implementation2;

import java.util.Observable;
import java.util.Observer;

public class ObserverA implements Observer {

    @Override
    public void update(Observable o, Object arg) {
        if (o instanceof LoginLogoutObservable) {
            LoginLogoutObservable loginLogoutObservable = (LoginLogoutObservable) o;
            if (loginLogoutObservable.isLoggedIn()) {
                System.out.println("isLoggedIn, " +
                        arg.toString());
            } else {
                System.out.println("isLoggedOut");
            }
        }
    }
}
