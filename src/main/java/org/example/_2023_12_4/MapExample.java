package org.example._2023_12_4;

import com.github.javafaker.Faker;

import javax.print.attribute.standard.QueuedJobCount;
import java.util.*;

public class MapExample {
    private static final Faker FAKER = new Faker();

    public static void main(String[] args) {
        Map<Integer, String> map = new HashMap<>();
        for (int i = 1; i < 6; i++) {
            map.put(i, FAKER.name().name());
        }

        List<String> list = new LinkedList<>();
        for (int i = 0; i < 5; i++) {
            list.add("L: " + FAKER.name().name());
        }

        Set<Integer> set = new HashSet<>();

//        for (String str : list) {
//            System.out.println(str);
//        }

        for (Integer entry : map.keySet()) {
            System.out.println(entry);
        }

        Map<Student, Double> studentIntegerMap = new HashMap<>();
        studentIntegerMap.put(new Student(), 7.8d);

    }
}
