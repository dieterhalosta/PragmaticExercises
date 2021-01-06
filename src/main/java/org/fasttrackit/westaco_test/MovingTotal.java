package org.fasttrackit.westaco_test;

import java.util.ArrayList;
import java.util.List;

public class MovingTotal {
    List<Integer> numbers = new ArrayList<>();
    /**
     * Adds/appends list of integers at the end of internal list.
     */
    public void append(int[] list) {
        for(int num:list) {
            numbers.add(num);
        }
        System.out.println(numbers);
    }

    /**
     * Returns boolean representing if any three consecutive integers in the
     * internal list have given total.
     */
//    public boolean contains(int total) {
//
//    }

    public static void main(String[] args) {
        MovingTotal movingTotal = new MovingTotal();

        movingTotal.append(new int[] { 1, 2, 3 });


//        System.out.println(movingTotal.contains(6));
//        System.out.println(movingTotal.contains(9));

        movingTotal.append(new int[] { 4 });

//        System.out.println(movingTotal.contains(6));
//        System.out.println(movingTotal.contains(9));
    }
}
