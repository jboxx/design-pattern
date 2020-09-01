package io.jboxx.designpattern.strategypattern.implementation1.wheel;

public class TwoWheels implements IWheels {

    private final String tireType;
    private final String tireBrand;

    public TwoWheels(String tireType, String tireBrand) {
        this.tireType = tireType;
        this.tireBrand = tireBrand;
    }

    @Override
    public int wheelsNumber() {
        return 2;
    }

    @Override
    public String wheelsTireType() {
        return tireType;
    }

    @Override
    public String tireBrand() {
        return tireBrand;
    }
}
