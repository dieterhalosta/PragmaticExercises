package org.fasttrackit.dataStructures;

import java.time.LocalDate;
import java.util.*;


public class SortingRecords  {

     public static void main(String[] args) {


        List<Map<String, Object>> records = new ArrayList<>();

        Map<String, Object> record1 = new HashMap<>();
        record1.put("first_name", "John");
        record1.put("last_name","Johnson");
        record1.put("position", "Manager");
        record1.put("separation_date", LocalDate.of(2016,12,31));
        records.add(record1);

        Map<String, Object> record2 = new HashMap<>();
        record2.put("first_name", "Tou");
        record2.put("last_name","Xiong");
        record2.put("position", "Software Engineer");
        record2.put("separation_date", LocalDate.of(2016,10,05));
        records.add(record2);

        Map<String, Object> record3 = new HashMap<>();
        record3.put("first_name", "Michaela");
        record3.put("last_name","Michaelson");
        record3.put("position", "District Manager");
        record3.put("separation_date", LocalDate.of(2015,12,19));
        records.add(record3);


        Map<String, Object> record4 = new HashMap<>();
        record4.put("first_name", "Jake");
        record4.put("last_name","Jacobson");
        record4.put("position", "Programmer");
        records.add(record4);


        Map<String, Object> record5 = new HashMap<>();
        record5.put("first_name", "Jacquelyn");
        record5.put("last_name","Jackson");
        record5.put("position", "DBA");
        records.add(record5);


        Map<String, Object> record6 = new HashMap<>();
        record6.put("first_name", "Sally");
        record6.put("last_name","Weber");
        record6.put("position", "Web Developer");
        record6.put("separation_date", LocalDate.of(2015,12,18));
        records.add(record6);


        records.sort(Comparator.comparing(map1 -> map1.get("last_name").toString()));
        System.out.println(records);

    }
}


