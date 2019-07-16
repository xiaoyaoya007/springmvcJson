package com.etc.vo;

public class Calc {
    private int a;
    private int b;

    public Calc() {
    }

    @Override
    public String toString() {
        return "Calc{" +
                "a=" + a +
                ", b=" + b +
                '}';
    }

    public Calc(int a, int b) {
        this.a = a;
        this.b = b;
    }

    public int getA() {
        return a;
    }

    public void setA(int a) {
        this.a = a;
    }

    public int getB() {
        return b;
    }

    public void setB(int b) {
        this.b = b;
    }
}
