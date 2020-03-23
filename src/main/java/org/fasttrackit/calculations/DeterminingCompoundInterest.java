package org.fasttrackit.calculations;

import java.util.Scanner;

public class DeterminingCompoundInterest {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        final int RATE = 100;

        //User input
        System.out.println("What is the principal amount?");
        int amount = scanner.nextInt();
        System.out.println("What is the rate?");
        double userRate = scanner.nextDouble();
        System.out.println("What is the number of years?");
        int year = scanner.nextInt();
        System.out.println("What is the number of times the interest is compounded per year?");
        int compound = scanner.nextInt();

        //Calculation
        double calcRate = userRate / RATE;
        double example = amount * Math.pow(1+ (calcRate / compound), compound*year);

        //System output
        System.out.println("$" +amount + " invested at " + userRate + "% for " + year + " compounded " + compound + " times per year is $" + example);
    }
}
