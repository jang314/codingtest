package com.study.section06;

import java.util.Arrays;
import java.util.Scanner;

public class Ex02 {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int size = sc.nextInt();
        int[] arrays = new int[size];
        sc.nextLine();

        for(int i = 0; i < size; i++) {
            arrays[i] = sc.nextInt();
        }

        for(int i = 0; i < arrays.length; i++) {
            for(int j = 1; j < arrays.length-i; j++) {
                if(arrays[j-1] > arrays[j]) {
                    int temp = arrays[j-1];
                    arrays[j-1] = arrays[j];
                    arrays[j] = temp;
                }
            }
        }

        for (int arr : arrays) {
            System.out.printf("%d ", arr);
        }
    }
}
