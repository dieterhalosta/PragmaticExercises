package org.fasttrackit.calculations;

import java.util.Scanner;

public class ComputingSimpleInterest {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        final int RATE = 100;

        //User input
        System.out.println("Enter the principal:");
        int amount = scanner.nextInt();
        System.out.println("Enter the rate of interest:");
        double userRate = scanner.nextDouble();
        System.out.println("Enter the number of years:");
        int year = scanner.nextInt();

        //Calculation
        double calcRate = userRate / RATE;
        double calcInv = amount * (1 + calcRate * year);
        int calc = (int) Math.round(calcInv);

        //System output
        System.out.println("After " + year + " years at " + userRate + "%, the investment will be worth $" +calc);
    }
}
