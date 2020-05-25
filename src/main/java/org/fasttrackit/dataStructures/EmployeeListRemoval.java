package org.fasttrackit.dataStructures;

import org.fasttrackit.utils.ScannerUtils;

import java.util.ArrayList;

public class EmployeeListRemoval {
    public static void main(String[] args) {

        ArrayList<String> employees = new ArrayList<String>();
        employees.add("John Smith");
        employees.add("Jackie Jackson");
        employees.add("Chris Jones");
        employees.add("Amanda Cullen");
        employees.add("Jeremy Goodwin");

        System.out.println("There are " + employees.size() + " employees:\n" + employees + "\nEnter an employee name to remove:");
        String userInput = ScannerUtils.nextLine();

        for (int i=0; i<=employees.size(); i++){
            if(userInput.equals(employees.get(i))){
                employees.remove(i);
                System.out.println("There are " + employees.size() + " employees:\n" + employees);
                break;
            }
        }
    }
}
