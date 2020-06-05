package org.fasttrackit.dataStructures;

import org.fasttrackit.utils.ScannerUtils;

import java.util.ArrayList;
import java.util.Random;

public class ComputingStatistics {

    public static void EnterNumbers(){
        ArrayList<String> names = new ArrayList<String>();
            System.out.println("Enter a number:");
            String userInput = ScannerUtils.nextLine();

            for(int i=0; i<=names.size();i++){
                if (userInput.equals("done") || userInput.equals("DONE")){
                    System.out.println("You said done.");
                    System.out.println(names);
                    break;
                }
                names.add(userInput);
            }



//        int namesLength = names.size();
//        for (int j = 0; j < namesLength; j++) {
//            System.out.println(names.get(j));
//        }
//
//        Random r = new Random();
//        int choice = r.nextInt(namesLength);
//        String randomAnswer = names.get(choice);
//        System.out.println("The winner is... " + randomAnswer);

    }

    public static void main(String[] args) {
        EnterNumbers();
    }
}
