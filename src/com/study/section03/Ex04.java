package com.study.section03;

import java.awt.print.Pageable;
import java.util.Scanner;

public class Ex04 {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int n = sc.nextInt();
        int m = sc.nextInt();
        int[] array = new int[n];

        sc.nextLine();

        for(int i = 0; i < n; i++) {
            array[i] = sc.nextInt();
        }

        int sIdx = 0;
        int eIdx = 0;
        int count = 0;
        int total = 0;

        while(eIdx < n) {
            if(total <= m) {
                if(total == m) count++;
                total+=array[eIdx];
                eIdx++;
            } else {
                total -= array[sIdx];
                sIdx++;
            }
        }

        while(sIdx < n) {
            if(total == m) count++;
            total -= array[sIdx];
            sIdx++;
        }

        System.out.printf("%d", count);
    }
}
