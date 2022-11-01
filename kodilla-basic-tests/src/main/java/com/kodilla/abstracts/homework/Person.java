package com.kodilla.abstracts.homework;

public class Person {
    private String name;
    private String lastName;
    private int age;
    private Job job;





    public Person(String name, String lastName, int age, Job job) {
        this.name = name;
        this.lastName = lastName;
        this.age = age;
        this.job = job;




    }



    public String getName() {
        return name;
    }
    public String getLastName() {
        return lastName;

    }
    public int getAge() {
        return age;

    }
    public void showResponsibilties() {
        System.out.println(name + lastName + " " + job.getResponsibilities());
    }
    public void showAge() {
        System.out.println();
    }


}
