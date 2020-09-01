package io.jboxx.designpattern.bridgepattern;

public abstract class SideB {

    public final ISideA sideA;

    public SideB(ISideA sideA) {
        this.sideA = sideA;
    }

    abstract void doJobB();
}
