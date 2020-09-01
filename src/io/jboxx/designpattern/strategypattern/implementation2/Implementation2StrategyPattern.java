package io.jboxx.designpattern.strategypattern.implementation2;

public class Implementation2StrategyPattern {

    public static void main(String[] args) {

        LatestMovieEndpointStrategy getLatestMovieEndpoint = new LatestMovieEndpointStrategy();

        System.out.println("Endpoint : " + getLatestMovieEndpoint.endpoint());
        System.out.println("Error Message 401 : " + getLatestMovieEndpoint.errorMessage("401"));
        System.out.println("Request Class " + getLatestMovieEndpoint.getRequestClass());
        System.out.println("Response Class " + getLatestMovieEndpoint.getResponseClass());
    }
}
