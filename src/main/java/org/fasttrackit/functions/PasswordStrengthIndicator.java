package org.fasttrackit.functions;

import java.util.Arrays;
import java.util.Scanner;

public class PasswordStrengthIndicator {
    private static int passwordValidator(String pass){
        int passScore = 0;

        if (pass.length() < 8){
            return 0;
        } else if ( pass.length() >= 10 ) {
            passScore +=2;
        } else
            passScore +=1;

        if (pass.matches("(?=.*[0-9]).*")) {
            passScore +=2;
        }

        if (pass.matches("(?=.*[a-z]).*")) {
            passScore +=2;
        }

        if (pass.matches("(?=.*[A-Z]).*")){
            passScore +=2;
        }

        if (pass.matches("(?=.*[~!@#$%^&*()_-]).*")){
            passScore +=2;
        }

        return passScore;
    }
    public static void main(String[] args) {

        String[] passArr = {
                "012345",
                "abcdefgh",
                "abc123xyz",
                "1337h@xor!"
        };


        for(String pass : passArr){
            System.out.println(pass + ": " + passwordValidator(pass));
        }



    }
}
