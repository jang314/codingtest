package com.study.section06;

import java.util.Arrays;
import java.util.Scanner;

public class Ex05 {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int size = sc.nextInt();
        int[] arrays = new int[size];
        sc.nextLine();

        for (int i = 0 ; i < size; i++) {
            arrays[i] = sc.nextInt();
        }

        Arrays.sort(arrays);

        for(int i = 1 ; i < arrays.length; i++) {
            if(arrays[i-1] == arrays[i]) {
                System.out.println("D");
                return;
            }
        }

        System.out.printf("U");
    }
}
