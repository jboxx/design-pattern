package io.jboxx.designpattern.strategypattern.implementation1;

import io.jboxx.designpattern.strategypattern.implementation1.engine.IEngine;
import io.jboxx.designpattern.strategypattern.implementation1.style.IStyle;
import io.jboxx.designpattern.strategypattern.implementation1.wheel.IWheels;

public class Vehicle {

    private IStyle style;

    private IEngine engine;

    private IWheels wheels;

    public Vehicle(IStyle style, IEngine engine, IWheels wheels) {
        this.style = style;
        this.engine = engine;
        this.wheels = wheels;
    }

    public String information() {
        return "Engine manufacture " + "\n"
                + "Manufacutured in " + engine.engineManufactured() + "\n"
                + "Engine codenumber : " + engine.engineCode() + "\n"
                + "Combustion : " + engine.engineCombustion() + "\n"
                + "Cylinder numbers : " + engine.engineCylindersNumber() + "\n\n"

                + "Style " + "\n"
                + "Color : " + style.styleColor() + "\n"
                + "Type mod : " + style.styleType() + "\n"
                + "Number of doors : " + style.styleNumberOfDoors() + "\n"
                + "Style Artist : " + style.styleArtist() + "\n\n"

                + "Wheels " + "\n"
                + "Wheels number : " + wheels.wheelsNumber() + "\n"
                + "Tire Brand : " + wheels.tireBrand() + "\n"
                + "Tire Type : " + wheels.wheelsTireType();
    }
}
