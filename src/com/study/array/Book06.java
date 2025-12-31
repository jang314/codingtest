package com.study.array;

import java.util.Scanner;

public class Book06 {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int N = sc.nextInt();
        sc.nextLine();

        int[] S = new int[N+1];
        S[1] = 1;

        // 구간 합 저장
        for (int i = 2; i<=N; i++) {
            S[i] = S[i-1] + i;
        }

        int sIdx = 1;
        int eIdx = 1;
        int count = 0;

        while(eIdx <= N) {
            int sum = S[eIdx] - S[sIdx-1];
            if(sum == N) {
                count++;
                sIdx++;
                eIdx++;
            } else if(sum < N || (eIdx == sIdx)) {
                eIdx++;
            } else {
                sIdx++;
            }
        }

        System.out.println(count);


    }

}
