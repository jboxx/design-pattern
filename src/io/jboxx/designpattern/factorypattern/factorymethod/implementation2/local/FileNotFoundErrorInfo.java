package io.jboxx.designpattern.factorypattern.factorymethod.implementation2.local;

import io.jboxx.designpattern.factorypattern.factorymethod.implementation2.ErrorInfo;

public class FileNotFoundErrorInfo implements ErrorInfo {

    public static final String ERROR_CODE = "A002";

    @Override
    public String errorCode() {
        return ERROR_CODE;
    }

    @Override
    public String errorMessage() {
        return "File Not Found";
    }
}
