package io.jboxx.designpattern.proxypattern;

public class LazySubjectProxy implements ISubject {

    private final String importantArg;
    private RealSubject realSubject = null;

    public LazySubjectProxy(String importantArg) {
        this.importantArg = importantArg;
    }

    @Override
    public void request() {
        if (realSubject == null) {
            this.realSubject = new RealSubject(importantArg);
        }
        this.realSubject.request();
    }
}
