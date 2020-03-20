package org.fasttrackit.calculations;

import java.util.Scanner;

public class PaintCalculator {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        //User input
        System.out.println("What is the length of the room in feet?");
        int ceilingLenght = scanner.nextInt();
        System.out.println("What is the width of the room in feet?");
        int ceilingidth = scanner.nextInt();

        //Calculations
        int roomArea = ceilingLenght * ceilingidth;

        //System output
        System.out.println("You will need to purchase " + " gallons of paint to cover " + roomArea + " square feet.");
    }
}
