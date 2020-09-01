package io.jboxx.designpattern.decoratorpattern;

public abstract class AddOnDecorator extends Beverage {

    abstract String getDescription();

    abstract double cost();
}
