package com.kodilla.stream.optional.homework;

import org.junit.jupiter.api.Test;

import static org.junit.jupiter.api.Assertions.*;

class ApplicationTest {
    @Test
    public void shouldReturnTeacherName() {

        Teacher teacher = new Teacher("Andrzej Duda");

        Student student = new Student("Jan Kowalski", teacher);

        assertEquals("Andrzej Duda", teacher.getName());
    }

    @Test
    public void shouldReturnTeacherNullName() {

        Teacher teacher = new Teacher(null);

        Student student = new Student("Adam Nowak", teacher);

        assertEquals("<undefined>" , student.getTeacher());
    }
}


