package org.fasttrackit.functions;

import java.util.Arrays;
import java.util.Scanner;

public class AnagramChecker {

    static boolean isAnagram(char[]strg1, char[]strg2){
        int strg1Len = strg1.length;
        int strg2Len = strg2.length;

        if (strg1Len != strg2Len) {
            return false;
        } else {
            Arrays.sort(strg1);
            Arrays.sort(strg2);

            for (int i=0; i < strg1Len; i++){
                if(strg1[i] != strg2[i]){
                    return false;
                }
            }
        }
        return true;
    }


    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        System.out.println("Enter two strings and I'll tell you if they are anagrams: ");
        System.out.println("Enter the first string: ");
        String firstString = scanner.nextLine();
        System.out.println("Enter the second string: ");
        String secondString = scanner.nextLine();

        char[] strg1 = firstString.toCharArray();
        char[] strg2 = secondString.toCharArray();

        if(isAnagram(strg1, strg2)){
            System.out.println(Arrays.toString(strg1) + " and " + Arrays.toString(strg2) + " are anagrams.");
        } else {
            System.out.println(Arrays.toString(strg1) + " and " + Arrays.toString(strg2) + " are not anagrams.");
        }
    }
}
