package io.jboxx.designpattern.adapterpattern;

public class Adapter implements IAdapter {

    private final ExistingClass existingClass;

    public Adapter(ExistingClass existingClass) {
        this.existingClass = existingClass;
    }

    @Override
    public void run() {
        existingClass.run();
        System.out.println("Via Adapter");
    }
}
