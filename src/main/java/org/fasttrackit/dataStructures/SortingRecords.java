package org.fasttrackit.dataStructures;

import java.util.*;


public class SortingRecords  {

 public static class Employee implements Comparable<Employee> {
     private int id;
     private String firstName;
     private String lastName;
     private String position;
     private String separationDate;


     public int getId() {
         return id;
     }

     public void setId(int id) {
         this.id = id;
     }

     public String getFirstName() {
         return firstName;
     }

     public void setFirstName(String firstName) {
         this.firstName = firstName;
     }

     public String getLastName() {
         return lastName;
     }

     public void setLastName(String lastName) {
         this.lastName = lastName;
     }


     public String getPosition() {
         return position;
     }

     public void setPosition(String position) {
         this.position = position;
     }

     public String getSeparationDate() {
         return separationDate;
     }

     public void setSeparationDate(String separationDate) {
         this.separationDate = separationDate;
     }

     @Override
     public int compareTo(Employee employee) {
         return (int)(this.id - employee.getId());
     }

     @Override
     public String toString() {
         return "Employee{" +
                 "id=" + id +
                 ", firstName='" + firstName + '\'' +
                 ", lastName='" + lastName + '\'' +
                 ", position='" + position + '\'' +
                 ", separationDate='" + separationDate + '\'' +
                 '}';
     }
 }


    public static void main(String[] args) {

        Employee employee1 = new Employee();
        employee1.setId(1);
        employee1.setFirstName("John");
        employee1.setLastName("Johnson");
        employee1.setPosition("Manager");
        employee1.setSeparationDate("2016-12-31");

        Employee employee2 = new Employee();
        employee2.setId(2);
        employee2.setFirstName("Tou");
        employee2.setLastName("Xiong");
        employee2.setPosition("Software Engineer");
        employee2.setSeparationDate("2016-10-05");

        Employee employee3 = new Employee();
        employee3.setId(3);
        employee3.setFirstName("Michaela");
        employee3.setLastName("Michaelson");
        employee3.setPosition("District Manager");
        employee3.setSeparationDate("2015-12-19");

        Employee employee4 = new Employee();
        employee4.setId(4);
        employee4.setFirstName("Jake");
        employee4.setLastName("George");
        employee4.setPosition("Programmer");

        Employee employee5 = new Employee();
        employee5.setId(5);
        employee5.setFirstName("Jacquelyn");
        employee5.setLastName("Jackson");
        employee5.setPosition("DBA");


        Employee employee6 = new Employee();
        employee6.setId(6);
        employee6.setFirstName("Sally");
        employee6.setLastName("Weber");
        employee6.setPosition("Web Developer");
        employee6.setSeparationDate("2015-12-18");


        Map<String, Employee> map = new HashMap<>();

        map.put("Employee 1", employee1);
        map.put("Employee 2", employee2);
        map.put("Employee 3", employee3);
        map.put("Employee 4", employee4);
        map.put("Employee 5", employee5);
        map.put("Employee 6", employee6);

        List<Map<String, Employee>> records = new ArrayList<>();
        records.add(map);



        records.sort(Comparator.comparing(map1 -> map1.get("last_name").toString()));
        System.out.println(records);




    }
}

