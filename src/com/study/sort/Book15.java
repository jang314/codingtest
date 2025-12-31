package com.study.sort;

import java.util.Scanner;

public class Book15 {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int N = Integer.parseInt(sc.nextLine());

        int[] array = new int[N];
        for(int i =0 ; i<N; i++) {
            array[i] = Integer.parseInt(sc.nextLine());
        }


        for(int i=N; i>1; i--) {
            for(int j = 1; j < i; j++) {
                if(array[j-1] > array[j]) {
                    int temp = array[j];
                    array[j] = array[j-1];
                    array[j-1] = temp;
                }
            }
        }

        for(int result : array) {
            System.out.println(result);
        }
    }
}
