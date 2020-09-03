package io.jboxx.designpattern.observerpattern.implementation2;

import java.util.Observable;

public class LoginLogoutObservable extends Observable {

    private boolean isLoggedIn = false;

    public boolean isLoggedIn() {
        return isLoggedIn;
    }

    public void loggingIn(String userId) {
        if (!isLoggedIn) {
            isLoggedIn = true;
            setChanged();
            notifyObservers(userId);

        }
    }

    public void loggingOut() {
        if (isLoggedIn) {
            isLoggedIn = false;
            setChanged();
            notifyObservers();
        }
    }
}
