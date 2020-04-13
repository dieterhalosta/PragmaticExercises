package org.fasttrackit.makingdecisions;

import java.util.Scanner;

public class ComparingNumbers {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        System.out.println("Enter the first number:");
        int firstN = scanner.nextInt();
        System.out.println("Enter the second number:");
        int secondN = scanner.nextInt();
        System.out.println("Enter the third number:");
        int thirdN = scanner.nextInt();

        if(firstN == secondN || firstN == thirdN || secondN == thirdN){
            System.out.println("You entered same numbers. You need to enter different numbers.");
        } else if (firstN > secondN && firstN > thirdN) {
            System.out.println("The largest number is: " + firstN);
        } else if (secondN > thirdN) {
            System.out.println("The largest number is: " + secondN);
        } else {
            System.out.println("The largest number is: " + thirdN);
        }

    }
}
