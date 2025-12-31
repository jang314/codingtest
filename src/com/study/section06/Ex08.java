package com.study.section06;

import java.util.Arrays;
import java.util.Scanner;

public class Ex08 {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int n = sc.nextInt();
        int m = sc.nextInt();
        sc.nextLine();

        int[] arrays = new int[n];
        for(int i = 0 ; i < n ; i++) {
            arrays[i] = sc.nextInt();
        }

        Arrays.sort(arrays);

        for (int i = 0 ; i < arrays.length; i++) {
            if(arrays[i] == m) {
                System.out.printf("%d", i+1);
                break;
            }
        }
    }
}
