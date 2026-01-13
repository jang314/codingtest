package com.study.search;

import java.util.*;

/**
 * 이진탐색 : K번째 수 구하기
 * */
public class Book31 {
    public static void main(String[] args)  {
        Scanner sc = new Scanner(System.in);
        int N = Integer.parseInt(sc.nextLine());
        int k = Integer.parseInt(sc.nextLine());

        int[][] arrays = new int[N+1][N+1];

        for(int i = 1; i <arrays.length; i++) {
            for(int j = 1; j<arrays[i].length; j++) {
                arrays[i][j] = i*j;
            }
        }

        int sIdx = 1;
        int eIdx = k;

        while(sIdx <= eIdx) {
            int sum = 0;
            int mid = (sIdx + eIdx) / 2;
            for(int i = 1; i < arrays.length; i++) {
                if((mid/i) > N) {
                    sum += N;
                } else {
                    sum += (mid/i);
                }
            }

            if(sum < k) {
                sIdx = mid+1;
            } else {
                eIdx = mid-1;
            }
        }

        System.out.printf("%d ", sIdx);
    }
}
