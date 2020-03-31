package org.fasttrackit.makingdecisions;

import java.util.Scanner;

public class LegalDrivingAge {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        final int LEGAL_AGE = 16;

        System.out.println("Enter your age.");
        int userAge = scanner.nextInt();

        if (userAge <= LEGAL_AGE) {
            System.out.println("You are not old enough to legally drive.");
        } else {
            System.out.println("You are old enough to legally drive.");
        }

    }
}
