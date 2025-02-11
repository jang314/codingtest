package com.study.section02;

import java.util.Arrays;
import java.util.Collections;
import java.util.Scanner;
import java.util.stream.Collectors;

public class Ex11 {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int num = Integer.parseInt(sc.nextLine());
        int[][] arrays = new int[num+1][6];

        // 2차원 배열에 입력
        for(int i=1; i<=num; i++) {
            for(int j=1; j<=5; j++) {
                arrays[i][j] = sc.nextInt();
            }
        }

        int max = Integer.MIN_VALUE;
        int maxIdx = 1;
        // 탐색
        for(int i = 1; i < arrays.length; i++) {
            int cnt = 0;
            for(int j= 1; j < arrays.length; j++) {
                for(int k = 1; k <= 5; k++) {
                    if(arrays[i][k] == arrays[j][k]) {
                        cnt++;
                        break;
                    }
                }
            }

            if(cnt > max) {
                max = cnt;
                maxIdx = i;
            }
        }
        System.out.printf("%d",maxIdx);
    }
}
