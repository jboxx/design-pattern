package io.jboxx.designpattern.decoratorpattern;

public class CaramelAddOnDecorator extends AddOnDecorator {

    private final Beverage beverage;

    public CaramelAddOnDecorator(Beverage beverage) {
        this.beverage = beverage;
    }

    @Override
    String getDescription() {
        return beverage.getDescription() + " with Caramel";
    }

    @Override
    double cost() {
        return this.beverage.cost() + 20;
    }
}
