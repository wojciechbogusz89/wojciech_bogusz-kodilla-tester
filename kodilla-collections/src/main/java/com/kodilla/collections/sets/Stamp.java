package com.kodilla.collections.sets;

import java.util.Objects;

public class Stamp {
    private String stampName;
    private double stampSize;
    private String stempel;

    public Stamp(String stampName, double stampSize, String stempel){
        this.stampName = stampName;
        this.stampSize = stampSize;
        this.stempel = stempel;

    }

    public String getStampName() {
        return stampName;
    }

    public double getStampSize() {
        return stampSize;
    }

    public String getStempel() {
        return stempel;
    }

    @Override
    public boolean equals(Object o) {
        if (this == o) return true;
        if (o == null || getClass() != o.getClass()) return false;
        Stamp stamp = (Stamp) o;
        return Double.compare(stamp.stampSize, stampSize) == 0 && Objects.equals(stampName, stamp.stampName) && Objects.equals(stempel, stamp.stempel);
    }

    @Override
    public int hashCode() {
        return Objects.hash(stampName, stampSize, stempel);
    }

    @Override
    public String toString() {
        return "Stamp{" +
                "stampName='" + stampName + '\'' +
                ", stampSize=" + stampSize +
                ", stempel='" + stempel + '\'' +
                '}';
    }
}
