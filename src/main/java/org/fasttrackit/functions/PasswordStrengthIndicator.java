package org.fasttrackit.functions;

import org.fasttrackit.utils.ScannerUtils;

public class PasswordStrengthIndicator {

    public static void checkPass (String pass){

        if(pass.matches("(?=.*[0-9]).*") && pass.length()<8){
            System.out.println("The password '" + pass + "' is a very weak password.");
        } else if (pass.matches("(?=.*[a-zA-Z]).*") && pass.length()<8){
            System.out.println("The password '" + pass + "' is a weak password.");
        } else if (pass.matches("(?=.*[a-zA-Z]).*") && pass.matches("(?=.*[0-9]).*") && !pass.matches("(?=.*[~!@#$%^&*()_-]).*") && pass.length()>=8){
            System.out.println("The password '" + pass + "' is a strong password.");
        } else if (pass.matches("(?=.*[a-zA-Z]).*") && pass.matches("(?=.*[0-9]).*") && pass.matches("(?=.*[~!@#$%^&*()_-]).*") && pass.length()>=8){
            System.out.println("The password '" + pass + "' is a very strong password.");
        }

    }

    public static void main(String[] args) {

        System.out.println("Type in your password.");
        String userPass = ScannerUtils.nextLine();


        checkPass(userPass);
    }
}
