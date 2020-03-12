package org.fasttrackit.inputprocessingoutput;

import java.util.Scanner;

public class QuotGenerator {
    public static void main(String[] args) {
        System.out.println("What is the quot?");
        Scanner scanner = new Scanner(System.in);
        String quot = scanner.nextLine();
        System.out.println("Who said it?");
        String author = scanner.nextLine();
        System.out.println(author + " says, \"" + quot + "\".");
    }
}
