package org.fasttrackit.makingdecisions;


import java.util.Scanner;

public class TemperatureConverter {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        System.out.println("Press C to convert from Fahrenheit to Celsius.\nPress F to convert from Celsius to Fahrenheit.");
        String userInput = scanner.nextLine();
        final double FC = 5.0/9.0;
        final double CF = 9.0/5.0;

        switch (userInput) {
            case "c": {
                String userInputUpper = userInput.toUpperCase();
                System.out.println("Your choice: " + userInputUpper + "\nPlease enter the temperature in Fahrenheit:");
                double f = scanner.nextDouble();
                double c = ((f - 32) * FC);
                double roundOffC = (double) Math.round(c * 100) / 100;
                System.out.println("The temperature in Celsius is " + roundOffC);
                break;
            }
            case "C": {
                System.out.println("Your choice: " + userInput + "\nPlease enter the temperature in Fahrenheit:");
                double f = scanner.nextDouble();
                double c = ((f - 32) * FC);
                double roundOffC = (double) Math.round(c * 100) / 100;
                System.out.println("The temperature in Celsius is " + roundOffC);
                break;
            }
            case "f": {
                String userInputUpper = userInput.toUpperCase();
                System.out.println("Your choice: " + userInputUpper + "\nPlease enter the temperature in Celsius:");
                double c = scanner.nextDouble();
                double f = ((c * CF) + 32);
                double roundOffF = (double) Math.round(f * 100) / 100;
                System.out.println("The temperature in Fahrenheit is " + roundOffF);
                break;
            }
            case "F": {
                System.out.println("Your choice: " + userInput + "\nPlease enter the temperature in Celsius:");
                double c = scanner.nextDouble();
                double f = ((c * CF) + 32);
                double roundOffF = (double) Math.round(f * 100) / 100;
                System.out.println("The temperature in Fahrenheit is " + roundOffF);
                break;
            }
        }

    }

}
