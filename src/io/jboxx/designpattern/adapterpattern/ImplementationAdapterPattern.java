package io.jboxx.designpattern.adapterpattern;

public class ImplementationAdapterPattern {

    public static void main(String[] args) {
        IAdapter adapter = new Adapter(new ExistingClass());
        adapter.run();
    }
}
