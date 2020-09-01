package io.jboxx.designpattern.factorypattern.factorymethod.implementation2;

public class GeneralErrorInfo implements ErrorInfo {

    public static final String ERROR_CODE = "000";

    @Override
    public String errorCode() {
        return ERROR_CODE;
    }

    @Override
    public String errorMessage() {
        return "Unknown Error";
    }
}
