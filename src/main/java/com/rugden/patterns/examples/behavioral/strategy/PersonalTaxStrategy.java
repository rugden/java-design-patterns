package com.rugden.patterns.examples.behavioral.strategy;

//Concrete Strategy
public class PersonalTaxStrategy implements TaxStrategy {

    @Override
    public double calculateTax(double income) {

        System.out.println("PersonalTax");
        return income * 0.3;
    }
}
