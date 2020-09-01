package io.jboxx.designpattern.factorypattern.factorymethod.implementation2;

import io.jboxx.factorypattern.factorymethod.implementation2.local.DataCorruptErrorInfo;
import io.jboxx.factorypattern.factorymethod.implementation2.local.LocalErrorFactory;
import io.jboxx.factorypattern.factorymethod.implementation2.remote.NetworkErrorInfo;
import io.jboxx.factorypattern.factorymethod.implementation2.remote.RemoteErrorFactory;

public class Implementation2FactoryMethod {

    public static void main(String[] args) {

        ErrorInfo errorNetwork = new RemoteErrorFactory().createErrorInfo(NetworkErrorInfo.ERROR_CODE);
        System.out.println("code : " + errorNetwork.errorCode());
        System.out.println("message : " + errorNetwork.errorMessage());

        ErrorInfo unknown = new LocalErrorFactory().createErrorInfo(NetworkErrorInfo.ERROR_CODE);
        System.out.println("code : " + unknown.errorCode());
        System.out.println("message : " + unknown.errorMessage());

        ErrorInfo dataCorrupt = new LocalErrorFactory().createErrorInfo(DataCorruptErrorInfo.ERROR_CODE);
        System.out.println("code : " + dataCorrupt.errorCode());
        System.out.println("message : " + dataCorrupt.errorMessage());
    }
}
