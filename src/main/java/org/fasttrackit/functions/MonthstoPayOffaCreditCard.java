package org.fasttrackit.functions;

import java.util.Scanner;

public class MonthstoPayOffaCreditCard {
    static double calculateMonthsUntilPaidOff(int balance, int apr, int monthlyPayment){
        int i = (apr/100) / 365;
        System.out.println(i);
        double first = 1 + i;
        System.out.println(first);
        double second = Math.pow(first, 30);
        System.out.println(second);
        int third = balance / monthlyPayment;
        System.out.println(third);
        double firstLog = Math.log(1 + third * (1 + second));
        System.out.println(firstLog);
        double secondLog = Math.log(first);
        System.out.println(secondLog);
        int consta = -(1/30);
        System.out.println(consta);
        double logDiv = firstLog / secondLog;
        System.out.println(logDiv);
        return consta * logDiv;
    }

    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        System.out.println("What is your balance?");
        int balance = scanner.nextInt();
        System.out.println("What is the APR on the card (as a percent)?");
        int apr = scanner.nextInt();
        System.out.println("What is the monthly payment you can make?");
        int monthlyPayment = scanner.nextInt();

        double m = calculateMonthsUntilPaidOff(balance,apr,monthlyPayment);

        System.out.println("It will take you " + m + " months to pay off this card.");

    }
}
