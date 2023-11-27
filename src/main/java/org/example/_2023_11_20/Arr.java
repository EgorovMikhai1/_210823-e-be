package org.example._2023_11_20;

import lombok.Getter;

@Getter
public class Arr {
    private int test;
    private static int sum(int[] array) {
        int result = 0;
        int start = 0;
        int end = array.length - 1;

        while (start < end) {
            result += array[start] + array[end];
            start++;
            end--;
        }

        if (array.length % 2 != 0) {
            result += array[array.length / 2];
        }

        return result;
    }

    public static void main(String[] args) {
        int[] arr = {1, 2, 3, 6, 5, 4, 7, 8, 9};
        System.out.println(sum(arr));
    }
}
