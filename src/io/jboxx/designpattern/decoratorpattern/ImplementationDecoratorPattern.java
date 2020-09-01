package io.jboxx.designpattern.decoratorpattern;

public class ImplementationDecoratorPattern {

    public static void main(String[] args) {

        Espresso espresso = new Espresso();
        AddOnDecorator caramelAddon = new CaramelAddOnDecorator(espresso);

        System.out.println(caramelAddon.getDescription());
        System.out.println(caramelAddon.cost());

    }
}
