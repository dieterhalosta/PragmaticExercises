package org.fasttrackit.calculations;

import java.util.Scanner;

public class PaintCalculator {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        final int SQUARE_FEET_PER_GALLON = 350;

        //User input
        System.out.println("What is the length of the room in feet?");
        int ceilingLength = scanner.nextInt();
        System.out.println("What is the width of the room in feet?");
        int ceilingWidth = scanner.nextInt();

        //Calculations
        double roomArea = ceilingLength * ceilingWidth;
        double paintNeeded = roomArea / SQUARE_FEET_PER_GALLON;

        double gallonsNeeded = Math.round(paintNeeded);

        //System output
        System.out.println("You will need to purchase " + gallonsNeeded + " gallons of paint to cover " + roomArea + " square feet.");
    }
}
