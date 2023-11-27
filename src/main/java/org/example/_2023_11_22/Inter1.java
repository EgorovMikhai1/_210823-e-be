package org.example._2023_11_22;

public interface Inter1 {
    void get();
}

class Main1 {
    public static void main(String[] args) {
        Inter1 inter1 = new Inter1() {
            @Override
            public void get() {

            }
        };
    }
}
