package com;

import java.util.ArrayList;
import java.util.List;
import java.util.Optional;
import java.util.stream.Collectors;

public class Classroom {

    private final  List<Student> students;

    public Classroom(List<Student> students) {
        this.students = students;
    }

    public void addStudent(Student student) {
        students.add(student);
    }

    public List<Student> getStudents () {
        return new ArrayList<>(this.students);
    }



    public Optional<Student> findById(ArrayList<Student> students, int id) {
       return students.stream()
               .filter(student -> student.getId() == id)
               .findFirst();
    }

    public Optional<Student> findTopStudent() {
        return students.stream()
                .max((first, second) -> Integer.compare(first.getScore(), second.getScore()));
    }

    public List<Student> searchByNmae(ArrayList<Student> students,String name) {
        return students.stream()
                .filter(student ->  student.getName().contains(name))
                .collect(Collectors.toList());
    }
}


//헷갈리는 거 -> static