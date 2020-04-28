package org.fasttrackit.makingdecisions;

import java.util.Scanner;

public class TroubleshootingCarIssues {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        System.out.println("Is the car silent when you turn the Key?(Y/N)");
        String userInput = scanner.nextLine();

        if (userInput.equals("Y")){
            System.out.println("Are the battery terminals corroded?(Y/N)");
            String newInput = scanner.nextLine();
            if (newInput.equals("Y")){
                System.out.println("Clean terminals and try again.");
            } else if (newInput.equals("N")) {
                System.out.println("Replace cables and try again.");
            }
        } else if (userInput.equals("N")) {
            System.out.println("Does the car make a clicking noise?(Y/N)");
            String newInput = scanner.nextLine();
            if(newInput.equals("Y")){
                System.out.println("Replace the battery.");
            } else if(newInput.equals("N")){
                System.out.println("Does the car crank up but fail to start?(Y/N)");
                String nextInput = scanner.nextLine();
                if (nextInput.equals("Y")){
                    System.out.println("Check spark plug connections.");
                } else if (nextInput.equals("N")){
                    System.out.println("Does the engine start and then die?(Y/N)");
                    String nInput = scanner.nextLine();
                    if(nInput.equals("Y")){
                        System.out.println("Does your car have fuel injection?(Y/N)");
                        String lastInput = scanner.nextLine();
                        if (lastInput.equals("Y")){
                            System.out.println("Get it in for service.");
                        } else if (lastInput.equals("N")){
                            System.out.println("Check to ensure the choke is opening and closing.");
                        }
                    } else {
                        System.out.println("Burn it and get a new one.");
                    }
                }
            }
        }
    }
}
