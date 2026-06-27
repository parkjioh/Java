package com;

import java.util.ArrayList;
import java.util.List;

public class Main {
    public static void main(String[] args) {
        ArrayList<Student> students= new ArrayList<>();
        students.add(new Student( 1, "qq", 80));
        printAll(students);
        printAll(students);


    }

    public static void printAll(List<Student> students) {
        for (Student student : students) {
            System.out.println(student);
        }
    }


}