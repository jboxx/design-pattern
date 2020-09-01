package io.jboxx.designpattern.proxypattern;

public class RealSubject implements ISubject {

    private final String importantArguments;

    public RealSubject(String importantArguments) {
        this.importantArguments = importantArguments;
    }

    @Override
    public void request() {
        System.out.println("Real Implementation of request");
    }
}
