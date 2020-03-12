package org.fasttrackit.inputprocessingoutput;

import java.util.Scanner;

public class CountingCharNumber {
    public static void main(String[] args) {
        System.out.println("What is the input string?");
        Scanner scanner = new Scanner(System.in);
        String charInput = scanner.nextLine();
        int count = 0;
        for (int i = 0; i < charInput.length(); i++) {
            if (Character.isLetter(charInput.charAt(i)))
                count++;
        }
        System.out.println(charInput + " has " + count + " characters" );
    }
}
