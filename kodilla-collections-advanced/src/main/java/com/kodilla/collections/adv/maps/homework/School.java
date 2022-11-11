package com.kodilla.collections.adv.maps.homework;

import java.util.ArrayList;
import java.util.List;

public class School {

    private List<Double> school = new ArrayList<>();

    public School(List<Double> school) {
        this.school = school;
    }
    public double getSum() {
        double sum = 0.0;
        for (double schol : school)
            sum += schol;
        return sum;
    }

    public List<Double> getSchools() {
        return school;
    }

    public void setSchools(List<Double> schools) {
        this.school = schools;
    }

    @Override
    public String toString() {
        return "School{" +
                "schools=" + school +
                '}';
    }
}
