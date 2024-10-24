package org.example;

import java.util.InputMismatchException;
import java.util.Scanner;

import static java.lang.Math.round;

// Press Shift twice to open the Search Everywhere dialog and type `show whitespaces`,
// then press Enter. You can now see whitespace characters in your code.
public class Main {
    public static void main(String[] args) {
        int grossSalary = greetings();
            double taxSub = TaxCalculator.calculateTax(grossSalary);
            if (taxSub != -0.1) {
                output(grossSalary, taxSub);
            } else {
                System.exit(0);
            }

        }

        public static int greetings() {
            Scanner scanner = new Scanner(System.in);
            System.out.println("Welcome to the terminal tax checker");
            System.out.println("Please enter your annual gross salary: ");

            int input = 0;
            try {
                input = scanner.nextInt();
            } catch (InputMismatchException e) {
                System.out.println("Unrecognised integer");
                System.exit(0);
            }
            return input;
        }

        public static void output(int grossSalary, double taxSub) {
        double afterTax = grossSalary - taxSub;
        System.out.printf("With a gross salary of £%d.00\nYour tax deductions will be: £%.2f\nTake home salary: £%.2f", grossSalary, taxSub, afterTax);

        }

}