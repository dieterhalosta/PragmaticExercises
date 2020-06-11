package org.fasttrackit.dataStructures;

import org.fasttrackit.utils.ScannerUtils;

import java.util.ArrayList;
import java.util.List;

public class FilteringValues {

    public static List<Integer> filterEvenNumbers (List<Integer> list){
        int evenNumber;
        List<Integer> evenList = new ArrayList<>();
        for (Integer integer : list) {
            if (integer % 2 == 0) {
                evenNumber = integer;
                evenList.add(evenNumber);
            }
        }
        return evenList;
    }
    public static void numbers(List<Integer> list){
        for (Integer integer : list) {
            System.out.print(" "+integer);
        }
    }

    public static void main(String[] args) {

        //get input from user
        System.out.println("Enter a list of numbers, separated by spaces:");
        String userInput = ScannerUtils.nextLine();

        //convert string to array of Ints
        String[] userArray = userInput.split(" ");

        int userNumber;
        List<Integer> arrayListNumbers = new ArrayList<>();
        for(String s : userArray){
            userNumber = Integer.parseInt(s);
            arrayListNumbers.add(userNumber);
        }

        //getting the even numbers
        System.out.print("The even numbers are");
        numbers(filterEvenNumbers(arrayListNumbers));

    }
}
