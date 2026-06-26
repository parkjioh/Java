package com;

import java.util.ArrayList;
import java.util.List;

public class Student {
    private final int id;
    private final String name;
    private int score;

    public Student(int id, String name, int score) {
        this.id = id;
        this.name = name;
        this.score = score;
    }

    public int getId() {
        return id;
    }

    public String getName() {
        return name;
    }

    public int getScore() {
       return score;
    }

    public void setScore(int score) {
        if (score < 0 || score > 100 ) {
            throw new IllegalArgumentException("점수 확인");
        }
        this.score =  score;
    }

    public String getPassStatus(){
        if (score >= 60 ){
            return PassStatus.PASSED.getLabel();
        } else {
            return PassStatus.FAILED.getLabel();
        }

    }


    public static void updateScore(ArrayList<Student> students, int id, int score) {
        Student student = findById(students, id);

        if (student != null) {
            student.setScore(score);
        }
    }

    public static Student findById(ArrayList<Student> students, int id) {
        for (Student student : students) {
            if (student.getId() == id) {
                return student;
            }
        }

        return null;
    }

    @Override
    public String toString() {
        return id + " / " + name + " / " + score;
    }
}
