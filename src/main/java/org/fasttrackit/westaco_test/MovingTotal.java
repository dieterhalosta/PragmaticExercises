package org.fasttrackit.westaco_test;

import java.util.ArrayList;
import java.util.List;

public class MovingTotal {
    /*
    *   Design a data structure that can, efficiently with respect to time used, store and check if the total of any
    * three successively added elements is equal to a given total.
    *
    *   For example, new MovingTotal() creates an empty container with no existing totals. append({1, 2, 3}) appends
    * elements {1, 2, 3}, which means that there is only one existing total (1 + 2 + 3 = 6). append({4}) appends element
    * 4 and creates and additional total from {2, 3, 4}. There would now be two totals (1 + 2 + 3 = 6 and 2 + 3 + 4 = 9).
    * */


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
