package com.rugden.patterns.examples.behavioral.strategy;

import java.util.Arrays;
import java.util.List;

/**
 * @author Walmart Technology
 */
public class TaxStrategyDemoLambdas {

    public static void main(String[] args) {

        TaxStrategy personalTaxStrategy =  (income) -> {
            System.out.println("PersonalTax");
            return 0.30 * income;
        };

        TaxStrategy businessTaxStrategy =  (income) -> {
            System.out.println("BusinessTax");
            return 0.40 * income;
        };

        List<TaxStrategy> taxStrategyListLambda = Arrays.asList(personalTaxStrategy, businessTaxStrategy);

        //Calculate Tax for different scenarios with corresponding strategies
        taxStrategyListLambda.forEach(
            (strategy) -> System.out.println(strategy.calculateTax(30000.0))
        );

    }
}
