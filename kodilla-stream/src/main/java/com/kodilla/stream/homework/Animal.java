package com.kodilla.stream.homework;

import java.util.Objects;

public class Animal {
    private String kind;
    private int weight;
    private String color;
    private String group;


    public Animal(String kind, int weight, String color, String group) {
        this.kind = kind;
        this.weight = weight;
        this.color = color;
        this.group = group;
    }

    public String getGroup() {
        return group;
    }

    public int getWeight() {
        return weight;
    }

    public String getKind() {
        return kind;
    }

    @Override
    public boolean equals(Object o) {
        if (this == o) return true;
        if (o == null || getClass() != o.getClass()) return false;
        Animal animal = (Animal) o;
        return weight == animal.weight && color == animal.color && Objects.equals(kind, animal.kind) && Objects.equals(group, animal.group);
    }

    @Override
    public int hashCode() {
        return Objects.hash(kind, weight, color, group);
    }

    public String getColor() {
        return color;
    }
}

