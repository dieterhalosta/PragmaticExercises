package org.fasttrackit.inputprocessingoutput;

import java.time.LocalDate;
import java.util.Scanner;

public class RetirementCalculator {
    public static void main(String[] args) {
        System.out.println("What is your current age?");
        Scanner scanner = new Scanner(System.in);
        String age = scanner.nextLine();
        System.out.println("At what age would you like to retire?");
        String retireWishAge = scanner.nextLine();
        int userAge = Integer.parseInt(age);
        int userWish = Integer.parseInt(retireWishAge);
        int year = LocalDate.now().getYear();
        int retirementYearsLeft = userWish - userAge;
        int retirementYear = year + retirementYearsLeft;
        System.out.println("You have " + retirementYearsLeft + " years left until you can retire. \nIt\'s " + year + " , so you can retire in " + retirementYear + ".");
    }
}
