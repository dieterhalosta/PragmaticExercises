package org.fasttrackit.makingdecisions;

import java.util.Scanner;

public class TaxCalculator {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        final double TAX_RATE = 0.055;
        final String STATE = "WI";

        //User input

        System.out.println("What is the state?");
        String state = scanner.nextLine();
        System.out.println("Enter the price:");
        double itemAmount = scanner.nextDouble();



        if (state.equals(STATE)) {
            double taxCalc = itemAmount * TAX_RATE;
            double totalCalc = itemAmount + taxCalc;
            System.out.println("Amount entered: $" + itemAmount);
            System.out.println("Tax: $" + taxCalc);
            System.out.println("Total: $" + totalCalc);
        } else {
            System.out.println("Amount entered: $" + itemAmount);
        }

    }
}
