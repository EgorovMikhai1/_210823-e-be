package org.example._2023_12_13;

import java.util.ArrayList;

public interface Stack2023<T> {
    void put(); //put
    boolean isEmpty(); //
    T get();
}

class StackImpl<T> implements Stack2023<T> {
    ArrayList<T> stack = new ArrayList<>();

    @Override
    public void put() {

    }

    @Override
    public boolean isEmpty() {
        return false;
    }

    @Override
    public T get() {
        return null;
    }
}
