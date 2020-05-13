package org.fasttrackit.repetion;

import org.fasttrackit.utils.ScannerUtils;

public class GuessTheNumberGame {

    public static void letUsPlay(){
        System.out.println("Let's play Guess the Number.");
        selectLevel();
    }

    public static void selectLevel(){
        System.out.println("Pick a difficulty level (1, 2, or 3):");
        int lvl = ScannerUtils.nextIntAndMoveToNextLine();
        if (lvl == 1) {
            playGameLvl1(10);
        } else if (lvl == 2) {
            playGameLvl1(100);
        } else if (lvl == 3){
            playGameLvl1(1000);
        } else {
            System.out.println("You entered a non existing level. Please try again.");
            selectLevel();
        }
    }


    public static void playGameLvl1(int max){

        int min = 1;
        int randomNumber = (int)(Math.random() * (max - min +1) + min);
//        System.out.println(randomNumber);

        System.out.println("I have my number. What's your guess?");
        int userGuess = ScannerUtils.nextIntAndMoveToNextLine();
        int guess = 0;

        while (true){

            if (userGuess == randomNumber){
                guess++;
                System.out.println("You gor it in " + guess + " guesses!");
                playAgain();
                break;
            } else if (userGuess < randomNumber){
                guess++;
                System.out.println("Too low. Guess again:");
                userGuess = ScannerUtils.nextIntAndMoveToNextLine();
            } else {
                guess++;
                System.out.println("Too high. Guess again:");
                userGuess = ScannerUtils.nextIntAndMoveToNextLine();
            }

        }


    }

    public static void playAgain(){
        System.out.println("Play again? (y/n)");
        String playAgain = ScannerUtils.nextLine();
        if (playAgain.equals("y")){
            selectLevel();
        } else if (playAgain.equals("n")){
            System.out.println("Goodbye! :)");
        } else {
            System.out.println("You entered an invalid command. Please try again.");
            playAgain();
        }
    }



    public static void main(String[] args) {
        letUsPlay();
    }
}
