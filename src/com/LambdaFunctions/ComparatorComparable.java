package com.LambdaFunctions;

import java.util.ArrayList;
import java.util.Collections;
import java.util.List;

public class ComparatorComparable {

    public static void main(String[] args) {

        List<String> namesList = new ArrayList<>();

        namesList.add("Sai");
        namesList.add("Babu");
        namesList.add("Teja");
        namesList.add("Deepak");
        namesList.add("Ravali");
        namesList.add("Raghava");

        Collections.sort(namesList);
        System.out.println(namesList);


        List<Student> stuNames = new ArrayList<>();

        Student s1 = new Student();
        s1.id = 78;
        s1.name = "Bhuvan";
        s1.marks = 456;

        Student s2 = new Student();
        s2.id = 75;
        s2.name = "Srikanth";
        s2.marks = 564;

        Student s3 = new Student();
        s3.id = 76;
        s3.name = "Anvesh";
        s3.marks = 448;

        Student s4 = new Student();
        s4.id = 77;
        s4.name = "Balaji";
        s4.marks = 533;

        Student s5 = new Student();
        s5.id = 74;
        s5.name = "Dheeraj";
        s5.marks = 389;

        stuNames.add(s1);
        stuNames.add(s2);
        stuNames.add(s3);
        stuNames.add(s4);
        stuNames.add(s5);

        System.out.println("Sorted Based on Name : ");
        stuNames.stream().sorted().forEach(student -> System.out.println(student.name + " " + student.id));
        System.out.println();
        System.out.println("Sorted Based on Id : ");
        stuNames.stream().sorted(Student::compareId).forEach(student -> System.out.println(student.id + " " + student.name));
        System.out.println();
        System.out.println("Sorted Based on Marks : ");
        stuNames.stream().sorted(Student::compareMarks).forEach(student -> System.out.println(student.marks + " " + student.name));
    }
}
