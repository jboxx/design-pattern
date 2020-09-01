package io.jboxx.designpattern.factorypattern.factorymethod.implementation1;

public class CardFactory {

    public Card getCard(String cardId, String cardNumber) {
        switch (cardId) {
            case EmoneyMandiri.id:
                return new EmoneyMandiri(cardNumber);
            case BrizziBRI.id:
                return new BrizziBRI(cardNumber);
            default:
                return new UnknownCard();
        }
    }
}
