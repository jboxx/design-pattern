package io.jboxx.designpattern.bridgepattern;

public class ConcreteObjectOnSideB2 extends SideB {

    public ConcreteObjectOnSideB2(ISideA sideA) {
        super(sideA);
    }

    @Override
    void doJobB() {
        System.out.println("Do Job Bon Side B2");
        sideA.doJobA();
    }
}
