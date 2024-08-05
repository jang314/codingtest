package com.study.section02;

import java.util.Arrays;
import java.util.Scanner;

public class Ex01 {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int size = Integer.parseInt(sc.nextLine());
        String input = sc.nextLine();
        int[] array = Arrays.stream(input.split(" ")).mapToInt(s -> Integer.parseInt(s)).toArray();

        mySolution(array, size);
    }

    private static void mySolution(int[] array, int size) {
        System.out.printf("%d ", array[0]);
        for(int i = 1 ; i < size; i++) {
            if(array[i-1] < array[i]) {
                System.out.printf("%d ", array[i]);
            }
        }
    }
}


