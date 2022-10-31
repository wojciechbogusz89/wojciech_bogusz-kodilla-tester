package com.kodilla.abstracts.homework;

public abstract class Shape {

    double bokA;
    double bokB;

    double poleKwadratu;
    double obwodKwadratu;

    double poleprostokata;

    double obwodprostkata;

    double poletrojkata;

    double obwodtrojkata;



    double surfaceAreaSq() {
        return poleKwadratu = bokA * bokA;
    }
    double circuitSq() {
        return obwodKwadratu = bokA * 4;
    }
    double surfaceAreaRe() {
        return poleprostokata = bokA * bokB;

    }

    double circuitRe() {
        return obwodprostkata = bokA + bokB + bokA + bokB;
    }
    double surfaceAreaTr() {
        return poletrojkata = bokA * bokB;

    }

    double circuitTr() {
        return obwodtrojkata = bokB + bokA + bokA;
    }
}