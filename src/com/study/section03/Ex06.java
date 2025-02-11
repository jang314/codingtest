package com.study.section03;

import java.util.Scanner;

public class Ex06 {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int n =sc.nextInt();
        int k = sc.nextInt();
        sc.nextLine();
        int[] array = new int[n];

        for(int i=0; i < n; i++) {
            array[i] = sc.nextInt();
        }

        int max = 0;
        int sIdx = 0;
        int count = 0;
        int i = 0;

        while(i < array.length) {
            int kk = 0;
            i = sIdx;
            count = 0;
            while(i < array.length) {
                int target = array[i];
                if(target == 1) {
                    count++;
                } else {
                    if(kk < k) {
                        if(kk == 0) sIdx = i+1;
                        kk++;
                        count++;
                    } else {
                        break;
                    }
                }
                i++;
            }
            max = Math.max(max, count);
        }
        System.out.printf("%d", max);
    }
}
