package org.example._2023_12_18;

public class Wheel {
    public static void main(String[] args) {
        m((str, integer) -> System.out.println(str + " : " + integer));
    }

    public static void m(In in) {
        in.set("!@#!@#", 888);
    }

    public static void refer(String s) {
        System.out.println("!!!!!");
    }
}

@FunctionalInterface
interface In {
    void set(String s, Integer i);
}