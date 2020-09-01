package io.jboxx.designpattern.bridgepattern;

public class ConcreteObjectOnSideB1 extends SideB {

    public ConcreteObjectOnSideB1(ISideA sideA) {
        super(sideA);
    }

    @Override
    void doJobB() {
        System.out.println("Do Job B on Side B1");
        sideA.doJobA();
    }
}
