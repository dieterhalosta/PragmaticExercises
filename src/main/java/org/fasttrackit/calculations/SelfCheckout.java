package org.fasttrackit.calculations;

import java.util.Scanner;

public class SelfCheckout {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        final double TAX_RATE = 0.055;

        //User input
        System.out.println("Enter the price of item 1:");
        double itemOne = scanner.nextDouble();
        System.out.println("Enter the quantity of item 1:");
        int quantityItemOne = scanner.nextInt();
        System.out.println("Enter the price of item 2:");
        double itemTwo = scanner.nextDouble();
        System.out.println("Enter the quantity of item 2:");
        int quantityItemTwo = scanner.nextInt();
        System.out.println("Enter the price of item 3:");
        double itemThree = scanner.nextDouble();
        System.out.println("Enter the quantity of item 3:");
        int quantityItemThree = scanner.nextInt();

        //Calculations
        double subtotal = (itemOne * quantityItemOne) + (itemTwo * quantityItemTwo) + (itemThree * quantityItemThree);
        double taxCalc = subtotal * TAX_RATE;
        double totalCalc = subtotal + taxCalc;

        //System output
        System.out.println("Subtotal: $" + subtotal);
        System.out.println("Tax: $" + taxCalc);
        System.out.println("Total: $" + totalCalc);
    }
}
