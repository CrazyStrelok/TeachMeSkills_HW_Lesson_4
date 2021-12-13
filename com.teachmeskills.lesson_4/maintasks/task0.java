package com.teachmeskills.lesson_4;

import java.util.Arrays;
import java.util.Scanner;
import java.util.concurrent.locks.ReentrantReadWriteLock;

public class task0 {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        System.out.println(" Введите число ");
        int a = scanner.nextInt();
        int[][][] array = {{{1, 2 }, {10 , 20 }}, {{11 , 22}}};
        System.out.println(Arrays.deepToString(array));
        for (int i = 0; i < array.length; i++) {
            for (int j = 0; j < array[i].length; j++) {
                for (int k = 0; k < array[j].length; k++)
                    array[i][j][k] += a;
                    System.out.println(Arrays.deepToString(array));
            }
        }
    }
}

