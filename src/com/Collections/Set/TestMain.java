package com.Collections.Set;

import java.util.HashSet;
import java.util.Set;

public class TestMain {

    public static void main(String[] args) {
        Set<Student> st = new HashSet<>();

        Student s1 = new Student();
        s1.id = 1;
        s1.name = "Sai";
        s1.college = "GIET";
        Student s2 = new Student();
        s2.id = 2;
        s2.name = "Naveen";
        s2.college = "KIET";
        Student s3 = new Student();
        s3.id = 1;
        s3.name = "Sai";
        s3.college = "GIET";

        st.add(s1);
        st.add(s2);
        st.add(s3);

        for (Student s : st) {
            System.out.println(s);
        }

        if (s1.equals(s3)) {
            System.out.println("Equal");
        } else {
            System.out.println("Not Equal");
        }

    }


}
