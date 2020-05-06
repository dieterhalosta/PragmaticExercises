package org.fasttrackit.functions;

import java.util.Arrays;
import java.util.Scanner;

public class PasswordStrength {

    private static Boolean passChecker(String userPass){

        if (userPass.length()<8){
            System.out.println("The password '" + userPass + "' is to short");
            return false;
        } else if (userPass.matches("(?=.*[0-9]).*")){
            System.out.println("This password '" + userPass + "' is a very weak password.");
            return false;
        } else if (userPass.matches("(?=.*[a-z]).*")){
            System.out.println("This password '" + userPass + "' is a weak password.");
            return false;
        } else if (userPass.matches("(?=.*[A-Z]).*")){
            System.out.println("This password '" + userPass + "' is a weak password.");
            return false;
        } else if(userPass.matches("(?=.*[~!@#$%^&*()_-]).*") && userPass.matches("(?=.*[0-9]).*")){
            System.out.println("This password '" + userPass + "' is a strong password.");
            return true;
        }

        return true;
    }

    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        System.out.println("Type in your password.");
        String userPass = scanner.nextLine();

        char[] passArr = userPass.toCharArray();

        if(passChecker(userPass)){

        }
    }
}
