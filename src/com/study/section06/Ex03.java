package com.study.section06;

import java.util.Scanner;

public class Ex03 {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int size = sc.nextInt();
        int[] arrays = new int[size];
        sc.nextLine();

        for(int i = 0; i < size; i++) {
            arrays[i] = sc.nextInt();
        }

        for(int i = 1; i < arrays.length; i++) {
            int temp = arrays[i];
            int prev = i;
            while(prev > 0 && (temp < arrays[prev-1])) {
                arrays[prev] = arrays[prev-1];
                prev--;
            }
            arrays[prev] = temp;
        }

        for (int arr : arrays) {
            System.out.printf("%d ", arr);
        }
    }
}
