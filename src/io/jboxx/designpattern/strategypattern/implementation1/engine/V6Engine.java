package io.jboxx.designpattern.strategypattern.implementation1.engine;

public class V6Engine implements IEngine {

    private final String manifactured;
    private final String engineCode;
    private final String engineCombustion;

    public V6Engine(String manifactured, String engineCode, String engineCombustion) {
        this.manifactured = manifactured;
        this.engineCode = engineCode;
        this.engineCombustion = engineCombustion;
    }

    @Override
    public String engineManufactured() {
        return manifactured;
    }

    @Override
    public int engineCylindersNumber() {
        return 6;
    }

    @Override
    public String engineCode() {
        return engineCode;
    }

    @Override
    public String engineCombustion() {
        return engineCombustion;
    }
}
