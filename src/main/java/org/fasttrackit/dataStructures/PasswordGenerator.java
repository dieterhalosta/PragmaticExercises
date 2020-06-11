package org.fasttrackit.dataStructures;

import org.fasttrackit.utils.ScannerUtils;

import java.util.ArrayList;
import java.util.Collections;
import java.util.List;
import java.util.Random;

public class PasswordGenerator {

    public static String letter(){
        String lettChar = "abcdefghijklmnopqrstuvwxyz";
        Random r = new Random();
        char letter = lettChar.charAt(r.nextInt(lettChar.length()));
        return Character.toString(letter);
    }

    public static String specialChar(){
        ArrayList<String> specialChar = new ArrayList<>();
        specialChar.add("!");
        specialChar.add("$");
        specialChar.add("#");
        specialChar.add("&");
        specialChar.add("^");
        specialChar.add("*");
        specialChar.add("<");
        int rand = new Random().nextInt(specialChar.size());
        return specialChar.get(rand);
    }

    public static String number(){
        ArrayList<Integer> numChar = new ArrayList<>();
        numChar.add(0);
        numChar.add(1);
        numChar.add(2);
        numChar.add(3);
        numChar.add(4);
        numChar.add(5);
        numChar.add(6);
        numChar.add(7);
        numChar.add(8);
        numChar.add(9);
        int rand = new Random().nextInt(numChar.size());
        return String.valueOf(numChar.get(rand));

    }

    public static int passLength(){
        int length = 0;
        try{
            System.out.println("What's the minimum length?");
            length = ScannerUtils.nextIntAndMoveToNextLine();
            if (length <= 0){

                System.out.println("Please enter a number greater than 0");
                passLength();

            }
        }catch (Exception e) {
            System.out.println("You need to enter a number greater than 0.");
            passLength();
        }
        return length;
    }

    public static void main(String[] args) {

        System.out.println(specialChar());
        System.out.println(number());
        System.out.println(letter());
        int userPassLength = passLength();

        String character;
        System.out.println("How many special characters?");
        int specialCharacterLength = ScannerUtils.nextIntAndMoveToNextLine();
        System.out.println("How many numbers?");
        int numbersLength=ScannerUtils.nextIntAndMoveToNextLine();
        String number;
        int lettersLength = userPassLength-specialCharacterLength-numbersLength;
        String letters;

        List<String> password = new ArrayList<>();
        for(int i=0; i<specialCharacterLength; i++){
            character= specialChar();
            password.add(character);}
        for (int j=0; j<numbersLength;j++){
            number=number();
            password.add(number);}
        for (int k=0;k<lettersLength;k++){
            letters = letter();
            password.add(letters);
        }
        Collections.shuffle(password);
        System.out.println("Your password is");
        for (String s : password) {
            System.out.print(s);
        }
    }
}
