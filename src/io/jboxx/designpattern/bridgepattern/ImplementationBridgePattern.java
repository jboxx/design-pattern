package io.jboxx.designpattern.bridgepattern;

public class ImplementationBridgePattern {

    public static void main(String[] args) {

        ISideA objectSideA1 = new ConcreteObjectOnSideA1();
        ConcreteObjectOnSideB2 concreteObjectOnSideB2 = new ConcreteObjectOnSideB2(objectSideA1);
        concreteObjectOnSideB2.doJobB();

        ISideA objectSideA2 = new ConcreteObjectOnSideA2();
        ConcreteObjectOnSideB1 concreteObjectOnSideB1 = new ConcreteObjectOnSideB1(objectSideA2);
        concreteObjectOnSideB1.doJobB();
    }
}
