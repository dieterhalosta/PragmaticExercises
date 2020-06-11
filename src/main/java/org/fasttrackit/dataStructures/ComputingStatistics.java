package org.fasttrackit.dataStructures;

import org.fasttrackit.utils.ScannerUtils;

import java.text.DecimalFormat;
import java.util.ArrayList;
import java.util.Collections;

public class ComputingStatistics {
    private static DecimalFormat df2 = new DecimalFormat("#.##");

    public static void addNumbers(){
        //adding numbers to arrayList in String form
        ArrayList<String> numbers = new ArrayList<String>();
        System.out.println("Enter a number:");
        String userInput = ScannerUtils.nextLine();

        while (!userInput.equals("done")){
            numbers.add(userInput);
            System.out.println("Enter another number:");
            userInput = ScannerUtils.nextLine();
        }

        //convert string to int
        ArrayList<Integer> intNum = new ArrayList<Integer>();

        for (String number : numbers) {
            int intNumber = Integer.parseInt(number);
            intNum.add(intNumber);
        }

        //display numbers
//        for (Integer integer : intNum) System.out.print(integer + " ");
        System.out.println("Numbers: " + intNum);

        //calculate the average
        int total = 0;
        for (Integer integer : intNum) {
            total += integer;
        }
        int avg = total / intNum.size();
        System.out.println("The average is " + avg);

        //display min and max
        System.out.println("The minimum is " + Collections.min(intNum));
        System.out.println("The maximum is " + Collections.max(intNum));

        //display standard deviation
        double mean = (double) total / (double) intNum.size();
        double standardDeviation = 0.0;

        for (double num : intNum){
            standardDeviation += Math.pow(num - mean, 2);
        }

        double x = Math.sqrt(standardDeviation/(double) intNum.size());
        System.out.println("The standard deviation is " + df2.format(x));

    }

    public static void main(String[] args) {

        addNumbers();

    }
}
