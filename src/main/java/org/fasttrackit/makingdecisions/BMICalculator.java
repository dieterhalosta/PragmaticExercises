package org.fasttrackit.makingdecisions;

import java.util.Scanner;

public class BMICalculator {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        System.out.println("Please enter your height(inches):");
        double userHeight = scanner.nextDouble();
        System.out.println("Please enter your weight(pounds):");
        double userWeight = scanner.nextDouble();

        double userBMI = (userWeight/(userHeight*userHeight))*703;
        double roundOffBMI = (double) Math.round(userBMI * 100) / 100;

        if (userBMI > 25) {
            System.out.println("Your BMI is: " + roundOffBMI + "\nYou should see your doctor.");
        } else {
            System.out.println("Your BMI is: " + roundOffBMI + "\nYou are within the ideal weight range.");
        }
    }
}
