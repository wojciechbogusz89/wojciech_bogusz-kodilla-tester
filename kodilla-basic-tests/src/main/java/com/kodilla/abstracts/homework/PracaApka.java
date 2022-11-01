package com.kodilla.abstracts.homework;

public class PracaApka {
    public static void main(String[] args) {
        Job job = new Teacher();
        Person person = new Person("Marzena", "Ola", 76, job);
        Job job1 = new Driver();
        Person person1 = new Person("Zenon","Martyniuk", 44, job1);
        person.showResponsibilties();
        person.getAge();

        PersonProcessor processor = new PersonProcessor();
        processor.process(job, person);

        PersonProcessor processor1 = new PersonProcessor();
        processor1.process(job1, person1);

    }

}