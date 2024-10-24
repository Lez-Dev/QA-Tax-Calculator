package org.example;

import java.util.InputMismatchException;

public class TaxCalculator {


    public static double calculateTax(int annualIncome) {
            if (annualIncome > 0 && annualIncome < 14999) {
                return 0;
            }
            if (annualIncome >= 15000 && annualIncome < 19999) {
                return (annualIncome * 0.1);
            }
            if (annualIncome >= 20000 && annualIncome < 29999) {
                return (annualIncome * 0.15);
            }
            if (annualIncome > 30000 && annualIncome < 44999) {
                return (annualIncome * 0.2);
            }
            if (annualIncome >= 45000) {
                return (annualIncome * 0.25);
            } else {
                System.out.println("Invalid number entered");
                return -0.1;
            }
    }
}
