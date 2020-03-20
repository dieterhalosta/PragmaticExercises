package org.fasttrackit.calculations;

import java.text.DecimalFormat;
import java.util.Scanner;

public class CurrencyConversion {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        final int CONVERSATION_RATE_TO = 100;

        //User input
        System.out.println("How many euros are you exchanging?");
        int euro = scanner.nextInt();
        System.out.println("What is the exchange rate?");
        double rateFrom = scanner.nextDouble();

        //Calculations
        double dollarCalc = euro * (rateFrom / CONVERSATION_RATE_TO);
        DecimalFormat dollar = new DecimalFormat("###.##");

        //System output
        System.out.println(euro + " euros at an exchange rate of " + rateFrom + " is " + dollar.format(dollarCalc) + " U.S. dollars.");
    }
}
