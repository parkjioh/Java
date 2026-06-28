package com;

import java.util.ArrayList;
import java.util.List;
import java.util.Optional;
import java.util.Scanner;

public class Main {
    Scanner sc ;
    Classroom classroom = new Classroom();

    public static void main(String[] args) {
        Main main = new Main();
        main.run();
    }

    public Main(){
        this.sc = new Scanner(System.in);
        classroom.addStudent(new Student(1, "김하나", 87));
        classroom.addStudent(new Student(2, "이도윤", 92));
        classroom.addStudent(new Student(3, "박서준", 58));
    }

    public void run() {
        System.out.println("1. 전체 학생 조회 ");
        printAllStudent(classroom.getStudents());

        System.out.println("2. id 조회 ");
        System.out.print("id로 학생을 찾습니다. : ");
        int id = sc.nextInt();
        Optional<Student> findStudentById = classroom.findById(id);
        if (findStudentById.isEmpty()) {
            System.out.println("찾으시는 학생이 없습니다.");
            return;
        }

        System.out.println("3. 학생 점수 수정 ");
        System.out.printf("수정하실 학생의 점수를 입력하세요 : " );
        int updateScore = sc.nextInt();

        Student student = findStudentById.get();
        try {
            student.updateScore(updateScore);
        } catch (Exception e) {
            throw new RuntimeException(e);
        }

        System.out.println("4. 합격자 조회 ");
        List<Student> students = classroom.getPassedStudents();
        System.out.println(students);

        System.out.println("5. 최고 점수 학생 ");
        Optional<Student> topStudent = classroom.findTopStudent();
        System.out.println(topStudent.get());

        System.out.println("6. 학생 찾기 ");
        System.out.print("찾을 학생의 이름 : ");
        sc.nextLine();
        String name = sc.nextLine();
        // sc 자꾸 꺼지는 이유 -> 버퍼에 남아있는 엔터를 대신 읽어버려서

        List<Student> searchStudent = classroom.searchByName(name);
        System.out.println(searchStudent);





    }

    private void printAllStudent(List<Student> students) {
        for (Student student : students) {
            System.out.println(student);
        }
    }



}