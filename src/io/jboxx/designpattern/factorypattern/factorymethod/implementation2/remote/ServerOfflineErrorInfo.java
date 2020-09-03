package io.jboxx.designpattern.factorypattern.factorymethod.implementation2.remote;

import io.jboxx.designpattern.factorypattern.factorymethod.implementation2.ErrorInfo;

public class ServerOfflineErrorInfo implements ErrorInfo {

    public static final String ERROR_CODE = "002";

    @Override
    public String errorCode() {
        return ERROR_CODE;
    }

    @Override
    public String errorMessage() {
        return "Server Offline";
    }
}
