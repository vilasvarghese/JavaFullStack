package com.vilas.java8_tutorial.ch01.defaultinterface;

public abstract class CalculatorFactory {

    public static Calculator getInstance() {
        return new BasicCalculator();
    }
}
