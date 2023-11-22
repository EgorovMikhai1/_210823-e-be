package org.example._2023_11_22;

import java.io.Serializable;

public abstract class Animal {
    public abstract void move();

}

class Dog extends Animal implements FlyAble, Serializable {

    @Override
    public void move() {
        //7777777
    }

    @Override
    public void fly() {
        //3333333
    }
}

interface FlyAble {
    void fly();
}

class Cat extends Dog {

    @Override
    public void move() {
        //9999999
    }
}

class Main {
    public static void main(String[] args) {
        Dog dog = new Dog();
        Animal animal = new Dog();


    }
}