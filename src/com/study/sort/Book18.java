package com.study.sort;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.util.Arrays;
import java.util.Collections;
import java.util.Scanner;

public class Book18 {
    public static void main(String[] args) throws IOException {
        Scanner sc = new Scanner(System.in);
        int N = Integer.parseInt(sc.nextLine());
        int[] array = new int[N];
        int[] S = new int[N];
        for(int i = 0; i< N; i++) {
            array[i] = sc.nextInt();
        }

        Arrays.sort(array);

        S[0] = array[0];
        int sum = S[0];
        for (int i =1; i < array.length; i++) {
            S[i] = S[i-1] + array[i];
            sum += S[i];
        }
        System.out.println(sum);
    }
}
