package io.jboxx.designpattern.factorypattern.factorymethod.implementation2.local;

import io.jboxx.factorypattern.factorymethod.implementation2.ErrorInfo;
import io.jboxx.factorypattern.factorymethod.implementation2.GeneralErrorInfo;
import io.jboxx.factorypattern.factorymethod.implementation2.IErrorInfoFactory;

public class LocalErrorFactory implements IErrorInfoFactory {

    @Override
    public ErrorInfo createErrorInfo(String errorCode) {
        switch (errorCode) {
            case DataCorruptErrorInfo.ERROR_CODE:
                return new DataCorruptErrorInfo();
            case FileNotFoundErrorInfo.ERROR_CODE:
                return new FileNotFoundErrorInfo();
            default:
                return new GeneralErrorInfo();
        }
    }
}
