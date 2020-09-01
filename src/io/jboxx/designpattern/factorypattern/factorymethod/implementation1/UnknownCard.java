package io.jboxx.designpattern.factorypattern.factorymethod.implementation1;

public class UnknownCard implements Card {

    public static final String id = "Unknown_Card";

    @Override
    public String id() {
        return id;
    }

    @Override
    public String cardNumber() {
        return "";
    }

    @Override
    public String cardTech() {
        return "";
    }

    @Override
    public String cardBank() {
        return "";
    }

    @Override
    public String cardType() {
        return "";
    }

    @Override
    public String toString() {
        return "Card ID : " + id() + "\n" +
                "Card Number : " + cardNumber() + "\n" +
                "Card Tech : " + cardTech() + "\n" +
                "Bank : " + cardBank() + "\n" +
                "Type : " + cardType() + "\n";
    }
}
