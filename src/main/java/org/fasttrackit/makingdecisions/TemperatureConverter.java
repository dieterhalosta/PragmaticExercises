package org.fasttrackit.makingdecisions;


import java.util.Scanner;

public class TemperatureConverter {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        System.out.println("Press C to convert from Fahrenheit to Celsius.\nPress F to convert from Celsius to Fahrenheit.");
        String userInput = scanner.nextLine();

        if (userInput.equals("c")){
           String userInputUpper = userInput.toUpperCase();
            System.out.println("Your choice: " + userInputUpper + "\nPlease enter the temperature in Fahrenheit:");
            int f = scanner.nextInt();
            int c = ((f -32) * (5/9));
            System.out.println("The temperature in Celsius is " + c);
        } else if (userInput.equals("C")) {
            System.out.println("Your choice: " + userInput + "\nPlease enter the temperature in Fahrenheit:");
            int f = scanner.nextInt();
            int c = ((f - 32) * (5/9));
            System.out.println("The temperature in Celsius is " + c);
        } else if (userInput.equals("f")) {
            String userInputUpper = userInput.toUpperCase();
            System.out.println("Your choice: " + userInputUpper + "\nPlease enter the temperature in Celsius:");
            int c = scanner.nextInt();
            int f = ((c * (9/5)) + 32 );
            System.out.println("The temperature in Fahrenheit is " + f);
        } else if (userInput.equals("F")) {
            System.out.println("Your choice: " + userInput + "\nPlease enter the temperature in Celsius:");
            int c = scanner.nextInt();
            int f = ((c * (9/5)) + 32 );
            System.out.println("The temperature in Fahrenheit is " + f);
        }

    }

}
