package org.fasttrackit.calculations;

import java.util.Scanner;

public class PizzaParty {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        //User input
        System.out.println("How many people?");
        int people = scanner.nextInt();
        System.out.println("How many pizzas do you have?");
        int pizza = scanner.nextInt();

        //Calculations
        int piece = people / pizza;
        int leftover = people % pizza;

        //System output
        System.out.println(people + " people with " + pizza + " pizzas.");
        System.out.println("Each person gets " + piece + " pieces of pizza. \nThere are " + leftover + " leftover pieces.");
    }
}
