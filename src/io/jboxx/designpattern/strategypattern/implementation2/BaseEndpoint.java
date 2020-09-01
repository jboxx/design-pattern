package io.jboxx.designpattern.strategypattern.implementation2;

public abstract class BaseEndpoint<Res, Req> {

    abstract Class<Res> getResponseClass();

    abstract Class<Req> getRequestClass();

}
