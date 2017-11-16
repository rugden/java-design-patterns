package com.rugden.patterns.examples.behavioral.strategy;

/**
 * late tax payment which incurs a penalty
 */
public class BusinessTaxStrategy implements TaxStrategy {

    @Override
    public double calculateTax(double income) {

        System.out.println("BusinessTax");
        return income * 0.4;
    }
}