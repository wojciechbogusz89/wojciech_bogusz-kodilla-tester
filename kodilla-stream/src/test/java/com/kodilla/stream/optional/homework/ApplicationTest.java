package com.kodilla.stream.optional.homework;

import org.junit.jupiter.api.Test;

import static org.junit.jupiter.api.Assertions.*;

class  ApplicationTest {
    @Test
    public void shouldReturnTeacherName() {
        Student student = new Student("Jan Kowalski", new Teacher("Andrzej Duda"));
        String teacher = Application.getTeacherName(student);
        assertEquals("Andrzej Duda", teacher);
    }

    @Test
    public void shouldReturnUndefined() {
        Student student = new Student("Adam Nowak", null);
        String teacher = Application.getTeacherName(student);
        assertEquals("<undefined>", teacher);


    }
}


