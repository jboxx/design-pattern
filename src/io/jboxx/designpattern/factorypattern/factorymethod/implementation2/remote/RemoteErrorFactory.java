package io.jboxx.designpattern.factorypattern.factorymethod.implementation2.remote;

import io.jboxx.factorypattern.factorymethod.implementation2.ErrorInfo;
import io.jboxx.factorypattern.factorymethod.implementation2.GeneralErrorInfo;
import io.jboxx.factorypattern.factorymethod.implementation2.IErrorInfoFactory;

public class RemoteErrorFactory implements IErrorInfoFactory {

    @Override
    public ErrorInfo createErrorInfo(String errorCode) {
        switch (errorCode) {
            case NetworkErrorInfo.ERROR_CODE:
                return new NetworkErrorInfo();
            case ServerOfflineErrorInfo.ERROR_CODE:
                return new ServerOfflineErrorInfo();
            default:
                return new GeneralErrorInfo();
        }
    }
}
