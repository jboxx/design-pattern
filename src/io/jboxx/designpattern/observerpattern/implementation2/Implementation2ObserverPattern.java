package io.jboxx.designpattern.observerpattern.implementation2;

public class Implementation2ObserverPattern {

    public static void main(String[] args) {

        LoginLogoutObservable loginLogoutObservable = new LoginLogoutObservable();

        ObserverA observerA = new ObserverA();
        loginLogoutObservable.addObserver(observerA);

        ObserverB observerB = new ObserverB();
        loginLogoutObservable.addObserver(observerB);

        loginLogoutObservable.loggingIn("12343");

        loginLogoutObservable.loggingOut();

        loginLogoutObservable.loggingIn("assdasa");
    }
}
