package com.study.section06;

import java.util.Arrays;
import java.util.Scanner;

public class Ex06 {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int size = sc.nextInt();
        int arrays[] = new int[size];

        for(int i = 0 ; i < size; i++) {
            arrays[i] = sc.nextInt();
        }

        int[] copies = Arrays.copyOf(arrays, size);
        Arrays.sort(copies);

        int[] result = new int[2];
        int count = 0 ;
        for(int i = 0 ; i < size; i++) {
            if(arrays[i] != copies[i]) {
                result[count] = i+1;
                count++;
            }
        }
        System.out.printf("%d %d", result[0], result[1]);
    }
}
