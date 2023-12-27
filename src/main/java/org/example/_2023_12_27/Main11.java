package org.example._2023_12_27;

import java.util.Arrays;

public class Main11 {
    public static void main(String[] args) {
        int[][] array = new int[10][8];

        int[][] aM = {{1,2,3,4,5},
                      {6,7,8,9,10, 777},
                {11, 12}};
        int[][] aM1 = {{1,2,3,4,5, 6, 7, 7, 7},
                            {6,7,8,9,10, 777},
                                {11, 12}};

//        System.out.println(Arrays.deepToString(aM1));



//        System.out.println(aM1[0].length);
//        System.out.println(aM1[1].length);
//        System.out.println(aM1[2].length);
//        System.out.println(aM1.length);

//        System.out.println(Arrays.deepToString(aM));

        int[][] aM3 = {{1,2,3},
                   {6,7,8,9,10, 777},
                      {11, 12}};
//
        for (int i = 0; i < aM3[i].length; i++) {
            for (int j = 0; j < aM3[j].length; j++) {
                System.out.println( aM3[i][j]);
                System.out.println("*********************");
            }
        }

        int[][] aM2 = {{1, 2, 3, 4, 5, 6, 7, 7, 7},
                       {6, 7, 8, 9, 10, 777},
                       {11, 12}};


//        for (int i = 0; i < aM2[i].length; i++) {
//            for (int j = 0; j < ; j++) {
//
//            }
//        }

        System.out.println("||||||||||||||||||||||||||||||||||||||||||||||||||||||||||||||");

//        for (int i = 0; i < aM.length; i++) {
//            for (int j = 0; j < aM[i].length; j++) {
//                System.out.println( aM[j][i]);
//                System.out.println("*********************");
//            }
//        }
    }
}
