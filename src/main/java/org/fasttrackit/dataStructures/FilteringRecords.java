package org.fasttrackit.dataStructures;


import java.util.*;

public class FilteringRecords {
    public static class Student  {
        private String firstName;
        private String lastName;
        private String position;
        private String separationDate;
        private int id;

        public Student(int id, String firstName, String lastName, String position) {
            this.id = id;
            this.firstName = firstName;
            this.lastName = lastName;
            this.position = position;
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

        public int getId() {
            return id;
        }

        public void setId(int id) {
            this.id = id;
        }

        /*Comparator for sorting the list by Student Name*/
        public static Comparator<Student> StuNameComparator = new Comparator<Student>() {

            public int compare(Student s1, Student s2) {
                String StudentName1 = s1.getLastName().toUpperCase();
                String StudentName2 = s2.getLastName().toUpperCase();

                //ascending order
                return StudentName1.compareTo(StudentName2);

                //descending order
                //return StudentName2.compareTo(StudentName1);
            }};


        @Override
        public String toString() {
            return "[name=" + firstName + " " + lastName + ", position=" + position + "]";
        }

    }

    public static void main(String args[]){


        ArrayList<Student> arraylist = new ArrayList<Student>();
        arraylist.add(new Student(1, "John", "Johnson", "Manager"));
        arraylist.add(new Student(2, "Tou", "Xiong", "Software Engineer"));
        arraylist.add(new Student(3, "Michaela", "Michaelson", "District Manager"));
        arraylist.add(new Student(4, "Jake", "Jacobson", "Programmer"));
        arraylist.add(new Student(5, "Jacquelyn", "Jackson", "DBA"));
        arraylist.add(new Student(6, "Sally", "Weber", "Web Developer"));

        /*Sorting based on Student Name*/
        System.out.println("Student Name Sorting:");
        Collections.sort(arraylist, Student.StuNameComparator);

        for(Student str: arraylist){
            System.out.println(str);
        }

//        /* Sorting on Rollno property*/
//        System.out.println("RollNum Sorting:");
//        Collections.sort(arraylist, Student.StuRollno);
//        for(Student str: arraylist){
//            System.out.println(str);
//        }
    }

}

