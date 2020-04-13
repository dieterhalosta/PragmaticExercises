package org.fasttrackit.makingdecisions;

import java.util.Scanner;

public class MultistateSalesTaxCalculator {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        System.out.println("What is the order amount?");
        int userAmount = scanner.nextInt();
        System.out.println("What state do you live in?");
        scanner.nextLine();
        String userState = scanner.nextLine();


      if(userState.equals("Wisconsin")){
          System.out.println("What county do you live in?");
          String userCounty = scanner.nextLine();
          if (userCounty.equals("Eau Claire")){
              double countyTax = 0.05;
              double countyTaxCalcTotal = userAmount*countyTax;
              double totalAmount = countyTaxCalcTotal + userAmount;
              System.out.println("The tax is: " + countyTaxCalcTotal + "." + "\nThe total is: " + totalAmount + ".") ;
          } else if (userCounty.equals("Dunn")) {
              double countyTax = 0.04;
              double countyTaxCalcTotal = userAmount*countyTax;
              double totalAmount = countyTaxCalcTotal + userAmount;
              System.out.println("The tax is: " + countyTaxCalcTotal + "." + "\nThe total is: " + totalAmount + ".") ;
          } else {
              double countyTax = 0.06;
              double countyTaxCalcTotal = userAmount*countyTax;
              double totalAmount = countyTaxCalcTotal + userAmount;
              System.out.println("The tax is: " + countyTaxCalcTotal + "." + "\nThe total is: " + totalAmount + ".") ;
          }
      } else if (userState.equals("Illinois")){
          double countyTax = 0.08;
          double countyTaxCalcTotal = userAmount*countyTax;
          double totalAmount = countyTaxCalcTotal + userAmount;
          System.out.println("The tax is: " + countyTaxCalcTotal + "." + "\nThe total is: " + totalAmount + ".") ;
      } else {
          System.out.println("The total is: " + userAmount + ".");
      }
    }
}
