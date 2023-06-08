package com.LambdaFunctions;

import java.util.Objects;

public class Student implements Comparable {

    int id;
    String name;
    int marks;
    String grade;

    public int getId() {
        return id;
    }

    public void setId(int id) {
        this.id = id;
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public int getMarks() {
        return marks;
    }

    public void setMarks(int marks) {
        this.marks = marks;
    }

    public String getGrade() {
        return grade;
    }

    public void setGrade(String grade) {
        this.grade = grade;
    }


    @Override
    public boolean equals(Object o) {
        if (this == o) return true;
        if (!(o instanceof Student)) return false;
        Student student = (Student) o;
        return getId() == student.getId() && getMarks() == student.getMarks() && getName().equals(student.getName()) && getGrade().equals(student.getGrade());
    }

    @Override
    public int hashCode() {
        return Objects.hash(getId(), getName(), getMarks(), getGrade());
    }

    @Override
    public String toString() {
        return "Student{" +
                "id=" + id +
                ", name='" + name + '\'' +
                ", marks=" + marks +
                ", grade='" + grade + '\'' +
                '}';
    }

    @Override
    public int compareTo(Object n) {
        Student s = (Student) n;
        return this.name.compareTo(s.name);
    }

    public int compareId(Object i){
        Student s = (Student)i;
        this.compareTo(i);
        return Integer.compare(this.id, s.id);
    }

    public int compareMarks(Object m){
        Student s = (Student)m;
        this.compareTo(m);
        return Integer.compare(this.marks, s.marks);
    }

}
