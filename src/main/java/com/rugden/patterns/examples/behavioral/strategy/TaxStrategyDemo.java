package com.rugden.patterns.examples.behavioral.strategy;

import java.util.Arrays;
import java.util.List;

public class TaxStrategyDemo {

    public static void main(String[] args) {

        //Using Concrete classes to encapsulate tax calculation algorithm
        TaxStrategy personalTax = new PersonalTaxStrategy();
        TaxStrategy businessTax = new BusinessTaxStrategy();

        //Create a List of Tax strategies for different scenarios
        List<TaxStrategy> taxStrategyList = Arrays.asList(personalTax, businessTax);

        //Calculate Tax for different scenarios with corresponding strategies

        for (TaxStrategy taxStrategy : taxStrategyList) {
            System.out.println(taxStrategy.calculateTax(30000.0));
        }
    }
}
