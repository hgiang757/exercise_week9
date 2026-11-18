package com.lab;

public class ShippingCalculator {

    public double calculate(double weight, String type) {
        if (weight < 0) {
            throw new IllegalArgumentException("Cân nặng không được âm");
        }

        if ("EXPRESS".equals(type)) {
            return weight * 9000.0;
        } else if ("STANDARD".equals(type)) {
            return weight * 5000.0;
        }

        return 0.0;
    }
}