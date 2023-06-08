package com.LambdaFunctions;

import java.util.ArrayList;
import java.util.List;

public class CustomTypeFunction {

    public static void main(String[] args) {

        List<Student> myList = new ArrayList<>();

        Student s1 = new Student();
        s1.id = 103;
        s1.name = "Sai";
        s1.marks = 95;

        Student s2 = new Student();
        s2.id = 102;
        s2.name = "Naveen";
        s2.marks = 86;

        Student s3 = new Student();
        s3.id = 101;
        s3.name = "Sreeja";
        s3.marks = 83;

        Student s4 = new Student();
        s4.id = 104;
        s4.name = "Manju";
        s4.marks = 92;

        Student s5 = new Student();
        s5.id = 105;
        s5.name = "Roopesh";
        s5.marks = 74;

        myList.add(s1);
        myList.add(s2);
        myList.add(s3);
        myList.add(s4);
        myList.add(s5);

        myList.stream().map(stu -> {
            if (stu.getMarks() >= 90) {
                stu.grade = "A";
            } else if (stu.getMarks() >= 80) {
                stu.grade = "B";
            } else {
                stu.grade = "C";
            }
            return stu;
        }).filter(stu -> stu.getGrade().equals("A")).forEach(x -> {
            System.out.println(x.getId());
        });
    }
}
