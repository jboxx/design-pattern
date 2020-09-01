package io.jboxx.designpattern.commandpattern;

public class Light {

    private boolean isTurnedOn = false;

    public void on() {
        isTurnedOn = true;
        System.out.println("Light On");
    }

    public void off() {
        isTurnedOn = false;
        System.out.println("Light Off");
    }

    public boolean isTurnedOn() {
        return isTurnedOn;
    }
}
