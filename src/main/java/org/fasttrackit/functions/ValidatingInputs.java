package org.fasttrackit.functions;

import org.fasttrackit.utils.ScannerUtils;

import java.util.InputMismatchException;

public class ValidatingInputs {

    public static Boolean validateNames(String name){
        if (name.isBlank()){
            return false;
        } else if(name.length()<=2){
            return false;
        }

        return true;
    }

    public static String validateZipCode (){
        System.out.println("Enter the ZIP code:");
        try {
            int zipCode = ScannerUtils.nextIntAndMoveToNextLine();

        } catch (InputMismatchException e){

            return "The ZIP code must be numeric.";
        }

        return "There were no error found.";
    }



    public static void validateEmployeeId (){
        System.out.println("Enter an employee ID:");
        String employeeId = ScannerUtils.nextLine();

        if(employeeId.contains("-")){
            String[] toWork = employeeId.split("-");
            System.out.println(toWork[0]);
            System.out.println(toWork[1]);
            String firstArr = toWork[0];
            String secondArr = toWork[1];

            System.out.println(secondArr);

            if(secondArr.matches("(?=.*[0-9]).*") && !secondArr.matches("(?=.*[a-zA-Z]).*") && secondArr.length()==4 && firstArr.matches("(?=.*[a-zA-Z]).*") && !firstArr.matches("(?=.*[0-9]).*") && firstArr.length()==2){
                System.out.println("IT works");
            } else {
                System.out.println("NOpe");
            }

        } else {
            System.out.println(employeeId + " is not a valid ID.");
            validateEmployeeId();
        }
    }

    public static void validateInput(){

        System.out.println("Enter the first name:");
        String firstName = ScannerUtils.nextLine();
        System.out.println("Enter the last name:");
        String lastName = ScannerUtils.nextLine();

        if(validateNames(firstName)){
            if (validateNames(lastName)){

            }
        } else {
            System.out.println(firstName + " is not a valid first name. It is too short");
        }

    }

    public static void main(String[] args) {
//        System.out.println("Enter the first name:");
//        String firstName = ScannerUtils.nextLine();
//        System.out.println("Enter the last name:");
//        String lastName = ScannerUtils.nextLine();
//        System.out.println("Enter the ZIP code:");
//        int zipCode = ScannerUtils.nextIntAndMoveToNextLine();
//        System.out.println("Enter an employee ID:");
//        String employeeId = ScannerUtils.nextLine();

//        System.out.println(firstName + " " + lastName + " ");

//        String result = validateNames(firstName);
//        System.out.println(result);
//        String zCode = validateZipCode();
//        System.out.println(zCode);
        validateEmployeeId();

    }
}
