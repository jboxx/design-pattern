package io.jboxx.designpattern.factorypattern.factorymethod.implementation1;

public class BrizziBRI implements Card {

    public static final String id = "Brizzi_BRI_V2";
    private final String cardNumber;
    private final String cardTech;

    public BrizziBRI(String cardNumber, String cardTech) {
        this.cardNumber = cardNumber;
        this.cardTech = cardTech;
    }

    public BrizziBRI(String cardNumber) {
        this(cardNumber, null);
    }

    @Override
    public String id() {
        return id;
    }

    @Override
    public String cardNumber() {
        return cardNumber;
    }

    @Override
    public String cardTech() {
        if (cardTech != null) {
            return cardTech;
        }
        return "NfcA/NfcB";
    }

    @Override
    public String cardBank() {
        return "BRI";
    }

    @Override
    public String cardType() {
        return "E-Money";
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
