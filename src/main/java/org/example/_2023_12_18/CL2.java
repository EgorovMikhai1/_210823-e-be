package org.example._2023_12_18;

import java.util.Arrays;
import java.util.List;

public class CL2 {
    public static void main(String[] args) {
        List<Integer> list = Arrays.asList(32, 1, 66, 49, 87, 65, 43, 21);
//        list.forEach(el -> System.out.print(el + " : "));

        list.stream()
                .filter(element -> element % 2 == 0)
                .map(el -> el * 10)
                .forEach(System.out::println);
    }
}
