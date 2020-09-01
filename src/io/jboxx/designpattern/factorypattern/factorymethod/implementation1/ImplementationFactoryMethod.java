package io.jboxx.designpattern.factorypattern.factorymethod.implementation1;

public class ImplementationFactoryMethod {

    public static void main(String[] args) {
        Card emoneyMandiri = new CardFactory().getCard(EmoneyMandiri.id, "12345");
        System.out.println(emoneyMandiri.toString());

        Card brizzi = new CardFactory().getCard(BrizziBRI.id, "ABCDE");
        System.out.println(brizzi.toString());

    }
}
