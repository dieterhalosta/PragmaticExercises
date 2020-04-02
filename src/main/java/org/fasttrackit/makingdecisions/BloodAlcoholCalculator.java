package org.fasttrackit.makingdecisions;

import java.util.Scanner;

public class BloodAlcoholCalculator {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        final double MAX_DRINKING_LIMIT = 0.08;
        final double WADR = 0.66;
        final double MADR = 0.73;

        System.out.println("Are you a man or a woman?");
        String userSex = scanner.nextLine();
        System.out.println("Enter the total alcohol consumed, in ounces (oz).");
        double consumedAlcoholOz = scanner.nextDouble();
        System.out.println("Enter body weight in pounds.");
        double userWeightPounds = scanner.nextDouble();
        System.out.println("Enter number of hours since the last drink.");
        int hoursFromLastDrink = scanner.nextInt();

        if (userSex.equals("woman")) {
            double womanBACInOzAndPounds = (((consumedAlcoholOz * 5.14) / (userWeightPounds * WADR)) - (0.015 * hoursFromLastDrink));
            if (womanBACInOzAndPounds >= MAX_DRINKING_LIMIT) {
                System.out.println("Your BAC in oz/pound is: " + womanBACInOzAndPounds + ". You are not allowed to drive!" );
            } else {
                System.out.println("Your BAC in oz/pound is: " + womanBACInOzAndPounds + ". You can still drive!");
            }
        } else {
            double manBACInOzAndPounds = (((consumedAlcoholOz * 5.14) / (userWeightPounds * MADR)) - (0.015 * hoursFromLastDrink));
            if (manBACInOzAndPounds >= MAX_DRINKING_LIMIT) {
                System.out.println("Your BAC in oz/pound is: " + manBACInOzAndPounds + ". You are not allowed to drive!" );
            } else {
                System.out.println("Your BAC in oz/pound is: " + manBACInOzAndPounds + ". You can still drive!");
            }
        }
    }
}
