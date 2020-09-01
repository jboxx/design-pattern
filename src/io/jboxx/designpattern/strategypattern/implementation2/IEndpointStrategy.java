package io.jboxx.designpattern.strategypattern.implementation2;

public interface IEndpointStrategy {

    String endpoint();

    String errorMessage(String errorCode);

}
