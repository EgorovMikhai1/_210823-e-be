package org.example._2023_11_22;

import java.io.Serializable;

public abstract class Hero {
    abstract void run();
}

class Ogr extends Hero implements FlyAble, JumpAble, Serializable {
    @Override
    void run() {
        System.out.println("20");
    }

    @Override
    public void fly() {
        //
    }

    @Override
    public void jump() {

    }
}

class Elf extends Hero {
    @Override
    void run() {
        System.out.println("28");
    }
}

interface Flyable {
    void fly();

}

interface JumpAble {
    void jump();
}

class Extra {
    public void specialM(FlyAble flyAble) {

    }
}
