package org.fasttrackit.functions;

import java.util.Arrays;
import java.util.Scanner;

public class PasswordStrengthIndicator {
    static boolean passwordValidator(char[]passArr){
        int strgLen = passArr.length;

        if (strgLen <= 8) {
            return false;
        } else {
            Arrays.sort(passArr);
            for (char c : passArr) {
                if (Character.isDigit(c)) {
                    return false;
                } else if (Character.isLetter(c)) {
                    return false;
                }
            }
        }
        return true;
    }
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        System.out.println("Enter your password to be validated.");
        String userPassword = scanner.nextLine();

        char[] passArr = userPassword.toCharArray();

        if(passwordValidator(passArr)){
            System.out.println("The password is strong.");
        } else {
            System.out.println("The password is not strong");
        }

    }
}
