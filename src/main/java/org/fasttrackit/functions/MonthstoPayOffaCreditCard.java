package org.fasttrackit.functions;

import java.util.Scanner;

public class MonthstoPayOffaCreditCard {
    static double calculateMonthsUntilPaidOff(double balance, double apr, double monthlyPayment){
        double months;

        apr /=36500;

        months = (-1.0/30.0) * (Math.log(1 + ((balance/monthlyPayment) *(1 - (Math.pow((1+ apr), 30)))))) / Math.log(1+apr);

        return months;
    }

    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        System.out.println("What is your balance?");
        double balance = scanner.nextInt();
        System.out.println("What is the APR on the card (as a percent)?");
        double apr = scanner.nextInt();
        System.out.println("What is the monthly payment you can make?");
        double monthlyPayment = scanner.nextInt();

        double m = calculateMonthsUntilPaidOff(balance,apr,monthlyPayment);

        System.out.println("It will take you " + Math.round(m) + " months to pay off this card.");

    }
}
