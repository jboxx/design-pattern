package io.jboxx.designpattern.strategypattern.implementation1;

import io.jboxx.strategypattern.implementation1.engine.IEngine;
import io.jboxx.strategypattern.implementation1.engine.V4Engine;
import io.jboxx.strategypattern.implementation1.style.IStyle;
import io.jboxx.strategypattern.implementation1.style.JDMStyle;
import io.jboxx.strategypattern.implementation1.style.StanceStyle;
import io.jboxx.strategypattern.implementation1.wheel.FourWheels;
import io.jboxx.strategypattern.implementation1.wheel.IWheels;

public class ImplementationStrategyPattern {

    public static void main(String[] args) {

        IStyle styleHonda = new JDMStyle("White", "Takada", 4);
        IEngine engineHonda = new V4Engine("Japan", "12345", "N/A");
        IWheels wheelsHonda = new FourWheels("Tarmac", "Michelin");
        Vehicle honda = new Vehicle(styleHonda, engineHonda, wheelsHonda);
        System.out.println("=== Honda ===");
        System.out.println(honda.information());
        System.out.println("===========");
        System.out.println();

        IStyle styleMitshubishi = new StanceStyle("Blue", "Eller", 2);
        IEngine engineMitshubishi = new V4Engine("Germany", "ABCDE", "Turbo");
        IWheels wheelsMitshubishi = new FourWheels("Gravel", "Pirelli");
        System.out.println("=== Mitshubishi ===");
        Vehicle mitshubishi = new Vehicle(styleMitshubishi, engineMitshubishi, wheelsMitshubishi);
        System.out.println(mitshubishi.information());
        System.out.println("===========");

    }
}
