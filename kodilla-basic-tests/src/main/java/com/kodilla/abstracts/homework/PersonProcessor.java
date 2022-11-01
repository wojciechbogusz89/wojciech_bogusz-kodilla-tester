package com.kodilla.abstracts.homework;

public class PersonProcessor {
    public void process (Job job, Person person) {
        System.out.println("Pracownik" + person.getName() +" " + person.getLastName() +  " " + "w wieku" + person.getAge()+ " " +  " " + "zarabia" + " " + job.getSalary() + " " + "i do jego obowizkow nalezy" + " " + job.getResponsibilities()) ;
    }
}
