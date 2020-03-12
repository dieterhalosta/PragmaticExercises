package org.fasttrackit.inputprocessingoutput;

import java.util.Scanner;

public class SimpleMath {
    public static void main(String[] args) {
        System.out.println("What is the first number?");
        Scanner scanner = new Scanner(System.in);
        String firstNumber = scanner.nextLine();
        System.out.println("What is the second number?");
        String secondNumber = scanner.nextLine();
        int first = Integer.parseInt(firstNumber);
        int second = Integer.parseInt(secondNumber);
        int add = first + second;
        int diff = first - second;
        int multiply = first * second;
        int divide = first / second;
        System.out.println(firstNumber + " + " + secondNumber + " = " + add + "\n" + firstNumber + " - " + secondNumber + " = " + diff + "\n" + firstNumber + " * " + secondNumber + " = " + multiply + "\n" + firstNumber + " / " + secondNumber + " = " + divide );

    }
}
