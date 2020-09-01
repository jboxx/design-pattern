package io.jboxx.designpattern.strategypattern.implementation2;

import java.util.HashMap;

/**
 * I refer to this endpoint https://developers.themoviedb.org/3/movies/get-latest-movie
 */
public class LatestMovieEndpointStrategy
        extends BaseEndpoint<ResponseModel, RequestModel> implements IEndpointStrategy {

    private HashMap<String, String> errorMap = new HashMap<>();

    public LatestMovieEndpointStrategy() {
        initErrorMap();
    }

    private void initErrorMap() {
        errorMap.put("401", "Wrong authentication? talk to dev!");
        errorMap.put("403", "It's forbidden!");
        errorMap.put("404", "Uh not found?");
    }

    @Override
    Class<ResponseModel> getResponseClass() {
        return ResponseModel.class;
    }

    @Override
    Class<RequestModel> getRequestClass() {
        return RequestModel.class;
    }

    @Override
    public String endpoint() {
        return "/movie/latest";
    }

    @Override
    public String errorMessage(String errorCode) {
        return errorMap.get(errorCode);
    }
}
