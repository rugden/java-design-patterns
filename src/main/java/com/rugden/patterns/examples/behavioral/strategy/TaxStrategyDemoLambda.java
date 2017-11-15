package com.rugden.patterns.examples.behavioral.strategy;

import java.util.Arrays;
import java.util.List;

public class TaxStrategyDemoLambda {

    public static void main(String[] args) {

        //No need for concrete classes to encapsulate tax algorithms
        TaxStrategy personalTax = (income) -> {
            System.out.println("PersonalTax");
            return 0.30 * income;
        };
        TaxStrategy personalTaxWithPenalty = (income) -> {
            System.out.println("PersonalTaxWithPenalty");
            return 0.40 * income;
        };

        List<TaxStrategy> taxStrategyList = Arrays.asList(personalTax, personalTaxWithPenalty);

        //Calculate Tax for different scenarios with corresponding strategies
        taxStrategyList.forEach(
                (strategy) -> System.out.println(strategy.calculateTax(60000))
        );
    }
}
