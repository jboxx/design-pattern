package io.jboxx.designpattern.decoratorpattern;

public class SoyAddOnDecorator extends AddOnDecorator {

    private final Beverage beverage;

    public SoyAddOnDecorator(Beverage beverage) {
        this.beverage = beverage;
    }

    @Override
    String getDescription() {
        return beverage.getDescription() + " with Soy";
    }

    @Override
    double cost() {
        return this.beverage.cost() + 10;
    }
}
