package org.example._2023_12_18;

public class Wheel {
    public static void main(String[] args) {
        m(System.out::println, "@@@");
    }

    public static void m(In in, String str) {
        in.set(str);
    }

    public static void refer(String s) {
        System.out.println("!!!!!");
    }
}

@FunctionalInterface
interface In {
    void set(String s);
}