package org.fasttrackit.repetion;

import org.fasttrackit.utils.ScannerUtils;

public class AddingNumbers {


    public static void main(String[] args) {
        int sum = 0;


        for (int i=0; i<5; i++){
            System.out.println("Enter a number:");
            int userNumber = ScannerUtils.nextIntAndMoveToNextLine();
            sum +=userNumber;


        }

        System.out.println("The total is " + sum);

    }

}
