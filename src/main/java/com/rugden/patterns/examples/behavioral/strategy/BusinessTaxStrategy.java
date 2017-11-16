package com.rugden.patterns.examples.behavioral.strategy;

//Concrete Strategy
public class BusinessTaxStrategy implements TaxStrategy {

    @Override
    public double calculateTax(double income) {

        System.out.println("BusinessTax");
        return income * 0.4;
    }
}