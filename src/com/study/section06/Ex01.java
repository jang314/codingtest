package com.study.section06;

import java.util.*;

public class Ex01 {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int n = sc.nextInt();
        int[] arrays = new int[n];

        sc.nextLine();

        for(int i = 0; i< n; i++) {
            arrays[i] = sc.nextInt();
        }

        for(int i=0; i<arrays.length; i++) {
            int minIdx = i;
            for(int j=i+1; j < arrays.length; j++) {
                if(arrays[minIdx] > arrays[j]) {
                    minIdx = j;
                }
            }
            int temp = arrays[i];
            arrays[i] = arrays[minIdx];
            arrays[minIdx] = temp;
        }

        for (int arr : arrays) {
            System.out.printf("%d ", arr);
        }
    }
}
