package com.Java8Features;

import java.util.function.Function;

public class CustomTypeFunction {
    public static void main(String[] args) {

        Function<Student, Student> st = x -> {
            System.out.println(x);
            return null;
        };
        f1(st);

    }

    static void f1(Function<Student, Student> fun) {
        Student s1 = new Student();
        s1.id = 1;
        s1.name = "Sai";
        s1.college = "GIET";
        Student s2 = new Student();
        s2.id = 2;
        s2.name = "Bala ram";
        s2.college = "GIET";
        fun.apply(s1);
        fun.apply(s2);
    }
}
