package io.jboxx.designpattern.decoratorpattern;

public class Espresso extends Beverage {

    @Override
    String getDescription() {
        return "Espresso";
    }

    @Override
    double cost() {
        return 50;
    }
}
