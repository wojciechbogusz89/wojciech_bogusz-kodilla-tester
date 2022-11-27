package com.kodilla.stream.optional.homework;

import java.util.ArrayList;
import java.util.List;
import java.util.Optional;

public class Application {
    public static void main(String[] args) {
        List<Student> students = new ArrayList<>();
        students.add(new Student("Jan Kowalski", new Teacher("Andrzej Duda")));
        students.add(new Student("Adam Nowak", new Teacher(null)));
        students.add(new Student("Jacek Zielinski", new Teacher("Jaroslaw Kaczynski")));
        students.add(new Student("Krzysztof Wozny", new Teacher(null)));

        for (Student student : students) {
            System.out.println("Student: " + student.getName() + ", " + "Teacher: " +
                    student.getTeacher().map(teacher -> teacher.getName()).orElse("<undefined>"));

        }
    }
}
