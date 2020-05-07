package org.fasttrackit.functions;

import org.fasttrackit.utils.ScannerUtils;

import java.util.InputMismatchException;

public class ValidatingInputs {

    public static Boolean validateNamesNotNull(String name){
        return !name.isBlank();
    }

    public static Boolean validateNamesLength(String name){
        return name.length() > 2;
    }

    public static Boolean validatedZCode(){
        System.out.println("Enter the ZIP code:");
        try {
            int zipCode = ScannerUtils.nextIntAndMoveToNextLine();

        } catch (InputMismatchException e){

            return false;
        }

        return true;
    }

    public static Boolean employeeID(){
        System.out.println("Enter an employee ID:");
        String employeeId = ScannerUtils.nextLine();

        if(employeeId.isBlank()){
            return false;
        } else if (employeeId.contains("-")){
            String[] toWork = employeeId.split("-");
            String firstArr = toWork[0];
            String secondArr = toWork[1];
            return secondArr.matches("(?=.*[0-9]).*") && !secondArr.matches("(?=.*[a-zA-Z]).*") && secondArr.length() == 4 && firstArr.matches("(?=.*[a-zA-Z]).*") && !firstArr.matches("(?=.*[0-9]).*") && firstArr.length() == 2;
        } else {
            System.out.println(employeeId + " is not a valid ID.");
            employeeID();
        }

        return true;
    }

    public static void validateInput(){

        System.out.println("Enter the first name:");
        String firstName = ScannerUtils.nextLine();
        System.out.println("Enter the last name:");
        String lastName = ScannerUtils.nextLine();

        if(validateNamesNotNull(firstName)){
          if(validateNamesLength(firstName)){
              if(validateNamesNotNull(lastName)){
                  if(validateNamesLength(lastName)){
                      if (validatedZCode()){
                          if (employeeID()){
                              System.out.println("There were not errors found.");
                          } else {
                              System.out.println("Employee id is not a valid ID." );
                          }

                      }else{
                          System.out.println("The ZIP code must be numeric.");
                          validateInput();
                      }
                  }else{
                      System.out.println(lastName + " is not a valid first name. It is too short.");
                      validateInput();
                  }
              }else{
                  System.out.println("The last name must be filled in.");
                  validateInput();
              }
          } else{
              System.out.println(firstName + " is not a valid first name. It is too short.");
              validateInput();
          }
        } else {
            System.out.println("The first name must be filled in.");
            validateInput();
        }

    }

    public static void main(String[] args) {

        validateInput();


    }
}
