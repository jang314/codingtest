package com.study.section02;

import java.util.Arrays;
import java.util.Scanner;

public class Ex04 {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int size = sc.nextInt();
        int[] arr = new int[size];
        if(size >= 3) {
            arr[0] = 1;
            arr[1] = 1;
        }

        for(int i = 2; i<size; i++) {
            arr[i] = arr[i-2] + arr[i-1];
        }

        Arrays.stream(arr).forEach(a -> System.out.printf("%d ", a));
    }

    private static int fibo(int n) {
        System.out.printf("%d ", n);
        if(n == 1 || n == 2) {
            return 1 ;
        } else {
            int ret = fibo(n-1) + fibo(n-2);

            return ret;
        }
    }
}
