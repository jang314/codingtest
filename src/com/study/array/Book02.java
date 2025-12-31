package com.study.array;

import java.util.Scanner;

public class Book02 {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        int inputA = sc.nextInt();
        sc.nextLine();
        int array[] = new int[inputA];

        int max = 0;
        for(int i = 0 ; i < inputA; i++) {
            array[i] = sc.nextInt();
            if (max < array[i]) {
                max = array[i];
            }
        }

        // 1. 최대값을 먼저 구한다.
        // 2. 현재 인덱스 점수 /최대값*100
        double sum = 0;
        for(int score : array) {
            double v = (double) score / max;
            sum += (v*100);
        }
        System.out.println(sum/inputA);
        // 3. 새로운 배열에 저장
        // 4. 새로운 배열의 평균 average
    }
}
