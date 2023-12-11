package org.example._2023_12_11;

import com.github.javafaker.Faker;

import java.util.ArrayList;
import java.util.List;
import java.util.ListIterator;

public class IterableExample2 {
    public static void main(String[] args) {
        List<String> list = new ArrayList<>();
        for (int i = 0; i < 5; i++) {
            list.add(new Faker().artist().name());
        }

        System.out.println(list);

        ListIterator<String> listIterator = list.listIterator(list.size());
        while (listIterator.hasPrevious()) {
            System.out.println(listIterator.previous());
        }
    }
}
