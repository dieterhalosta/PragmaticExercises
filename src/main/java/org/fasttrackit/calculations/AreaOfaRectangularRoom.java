package org.fasttrackit.calculations;

import java.util.Scanner;

public class AreaOfaRectangularRoom {
    public static void main(String[] args) {
        final double CONVERSATION_FACTOR = 0.09290304;

        Scanner scanner = new Scanner(System.in);

        // User input
        System.out.println("What is the length of the room in feet?");
        int roomLenght = scanner.nextInt();
        System.out.println("What is the width of the room in feet?");
        int roomWidth = scanner.nextInt();

        // Calculations
        int roomArea = roomLenght * roomWidth;
        double roomAreaMeter = roomArea * CONVERSATION_FACTOR;

        // System output
        System.out.println("You entered dimensions of " + roomLenght + " feet by " + roomWidth + " feet.");
        System.out.println("The area is: \n" + roomArea + " square feet \n" + roomAreaMeter + " square meters");









    }
}
