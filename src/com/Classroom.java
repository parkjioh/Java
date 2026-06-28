package com;

import java.util.ArrayList;
import java.util.List;
import java.util.Optional;
import java.util.stream.Collectors;

public class Classroom {

    private final  List<Student> students;

    public Classroom() {
        this.students = new ArrayList<>();
    }

    public void addStudent(Student student) {
        students.add(student);
    }

    public List<Student> getStudents () {
        return new ArrayList<>(this.students);
    }



    public Optional<Student> findById(int id) {
       return students.stream()
               .filter(student -> student.getId() == id)
               .findFirst();
    }

    public List<Student> getPassedStudents() {
        return students.stream().filter(student -> student.getScore() >= 60).toList();
    }

    public Optional<Student> findTopStudent() {
        return students.stream()
                .max((first, second) -> Integer.compare(first.getScore(), second.getScore()));
    }

    public List<Student> searchByName(String name) {
        return students.stream()
                .filter(student ->  student.getName().contains(name))
                .collect(Collectors.toList());
    }
}


//헷갈리는 거 -> static