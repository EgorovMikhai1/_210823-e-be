package org.example._2023_12_11;

import java.util.*;

public class SetExample {
    public static void main(String[] args) {
        List<Integer> list = new ArrayList<>();
        list.add(11);
        list.add(22);
        list.add(33);
        list.add(44);

        Set<Integer> set = new HashSet<>(null);
        set.add(1);
        set.add(2);
        set.add(3);
        set.add(4);
        set.add(5);
        set.add(6);

        System.out.println(set);
    }
}