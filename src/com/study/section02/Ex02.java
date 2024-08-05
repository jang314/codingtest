package com.study.section02;

import java.util.Arrays;
import java.util.Comparator;
import java.util.Scanner;
import java.util.concurrent.atomic.AtomicInteger;

public class Ex02 {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int size = Integer.parseInt(sc.nextLine());

        String input = sc.nextLine();
        int[] array = Arrays.stream(input.split(" ")).mapToInt(s -> Integer.parseInt(s))
                .toArray();

        System.out.printf("%d ", mySolution(size,array));
    }

    private static int mySolution(int size, int[] array) {
        int max = array[0];
        int total = 1;

        for(int i = 1; i< size; i++) {
            if(max < array[i]) {
                max = array[i];
                total++;
            }
        }
        return total;
    }
}
