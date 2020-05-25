package org.fasttrackit.dataStructures;

import org.fasttrackit.utils.ScannerUtils;

import java.util.ArrayList;
import java.util.Random;

public class PickingAWinner {

    public static void WinnerNames(){
        ArrayList<String> names = new ArrayList<String>();
        for(int i=0; i<=4; i++) {
            System.out.println("Enter a name:");
            String userInput = ScannerUtils.nextLine();
            if (userInput.length()<1){
                System.out.println("You need to enter a valid name");
                break;
            }
            names.add(userInput);
        }
        int namesLength = names.size();
        for (int j = 0; j < namesLength; j++) {
            System.out.println(names.get(j));
        }

        Random r = new Random();
        int choice = r.nextInt(namesLength);
        String randomAnswer = names.get(choice);
        System.out.println("The winner is... " + randomAnswer);

    }

    public static void main(String[] args) {
        WinnerNames();
    }
}
