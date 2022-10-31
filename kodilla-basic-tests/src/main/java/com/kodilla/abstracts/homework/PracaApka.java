package com.kodilla.abstracts.homework;

public class PracaApka {
    public static void main(String[] args) {
        Person person = new Marzenka();
        Person person1 = new Zenek();
        Job job = new Teacher();
        Job job1 = new Driver();

        PersonProcessor processor = new PersonProcessor();
        processor.process(job, person);

        PersonProcessor processor1 = new PersonProcessor();
        processor1.process(job1, person1);

    }

}