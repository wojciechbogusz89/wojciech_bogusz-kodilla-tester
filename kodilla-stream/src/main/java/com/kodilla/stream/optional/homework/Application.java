package com.kodilla.stream.optional.homework;

import java.util.ArrayList;
import java.util.List;
import java.util.Optional;

public class Application {
    public static void main(String[] args) {
        List<Student> studentList = new ArrayList<>();
        studentList.add(new Student("Jan Kowalski", new Teacher("Andrzej Duda")));
        studentList.add(new Student("Adam Nowak", new Teacher(null)));
        studentList.add(new Student("Jacek Zielinski", new Teacher("Jaroslaw Kaczynski")));
        studentList.add(new Student("Krzysztof Wozny", new Teacher(null)));

        for(Student student : studentList) {

            String teacherName = getTeacherName(student);
            System.out.println("Student: " + student.getName() + " Teacher: " + teacherName);
        }
    }
    public static String getTeacherName (Student student) {
        Optional<Teacher> optionalTeacher = Optional.ofNullable(student.getTeacher());
        String teacher = optionalTeacher.orElse(new Teacher("<undefined>")).getName();
        return teacher;
    }
}
