package io.jboxx.designpattern.proxypattern;

public class ImplementationProxyPattern {

    public static void main(String[] args) {

        LazySubjectProxy lazySubjectProxy = new LazySubjectProxy("bla bla");
        lazySubjectProxy.request();
    }
}
