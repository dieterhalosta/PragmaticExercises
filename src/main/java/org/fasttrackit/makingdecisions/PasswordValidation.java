package org.fasttrackit.makingdecisions;

import java.util.Scanner;

public class PasswordValidation {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        final String PASSWORD = "abc$123";

        System.out.println("What is the password?");
        String userPassword = scanner.nextLine();

        if (userPassword.equals(PASSWORD)) {
            System.out.println("Welcome");
        } else {
            System.out.println("You entered a wrong password. I don't know you.");
        }
    }
}
