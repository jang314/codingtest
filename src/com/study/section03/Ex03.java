package com.study.section03;

import java.util.Arrays;
import java.util.Scanner;

public class Ex03 {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        int n = sc.nextInt();;
        int k =  sc.nextInt();

        sc.nextLine();
        int[] array = new int[n+1];
        int answer = 0;
        int sum = 0;

        for(int i = 0; i < n; i++) {
            array[i] = sc.nextInt();
        }

        for(int i = 0; i < array.length; i++) {
            if(i < k) {
                sum+= array[i];
                answer = sum;
            } else {
                sum+=array[i];
                sum-=array[i-k];
            }
            answer = Math.max(sum, answer);
        }

        System.out.printf("%d", answer);
    }
}
