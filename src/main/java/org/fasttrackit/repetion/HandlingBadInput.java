package org.fasttrackit.repetion;

import org.fasttrackit.utils.ScannerUtils;

import java.util.InputMismatchException;


public class HandlingBadInput {

    public static void rateCalculator(){
        System.out.println("What is the rate of return?");
        int userRate = ScannerUtils.nextIntAndMoveToNextLine();

        if(userRate <= 0){
            System.out.println("Sorry. That's not a valid input.");
            rateCalculator();

      } else {
            int years = 72 / userRate;
            System.out.println("It will take " + years + " years to double your initial investment.");
        }

    }

    public static void tryRateCalculator(){
        try {
            rateCalculator();
        } catch (Exception e) {
            System.out.println("Sorry. That's not a valid input.");
            rateCalculator();
        }
    }

    public static void main(String[] args) {

        tryRateCalculator();

    }
}
