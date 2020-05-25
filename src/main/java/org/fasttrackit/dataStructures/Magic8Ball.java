package org.fasttrackit.dataStructures;

import org.fasttrackit.utils.ScannerUtils;

import java.util.Random;

public class Magic8Ball {
    public static void magic8Ball(){

        String[] answers = {"Yes", "No", "Maybe", "Ask again later."};
        int stringLength = answers.length;

        Random r = new Random();
        int choice = r.nextInt(stringLength);

        String randomAnswer = answers[choice];

        System.out.println(randomAnswer);
    }

    public static void main(String[] args) {
        System.out.println("What's your question?");
        String userQuestion = ScannerUtils.nextLine();
        magic8Ball();
    }
}
