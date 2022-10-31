package com.kodilla.abstracts.homework;

public class PracaApka {
    public static void main(String[] args) {
        Person person = new Marzenka();
        Job job = new Teacher();

        PersonProcessor processor = new PersonProcessor();
        processor.process(job, person);

    }
}
