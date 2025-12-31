package com.study.sort;

import java.io.*;
import java.util.Arrays;
import java.util.LinkedList;
import java.util.Queue;

public class Book22 {
    public static void main(String[] args) throws IOException {
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        BufferedWriter bw = new BufferedWriter(new OutputStreamWriter(System.out));

        int N = Integer.parseInt(br.readLine());
        int[] array = new int[N];

        for(int i = 0 ; i< N; i++) {
            array[i] = Integer.parseInt(br.readLine());
        }
        br.close();

        int max = getMax(array);

        for(int i = 0; i < max; i++) {
            int count[] = new int[10];
            int bucket[] = new int[N];
            int pow = (int) Math.pow(10, i);
            for(int j = 0 ; j < array.length; j++) {
                int digit = array[j] / pow % 10;
                count[digit]++;
            }

            for(int j = 1; j < count.length; j++) {
                count[j] += count[j-1];
            }

            for(int j = array.length-1 ; j >= 0; j--) {
                int digit = array[j] / pow % 10;
                count[digit]--;
                bucket[count[digit]] = array[j];
            }

            for(int j = 0 ; j < array.length; j++) {
                array[j] = bucket[j];
            }
        }

        // result
        for(int i=0; i<array.length; i++) {
            System.out.println(array[i]);
        }
    }

    private static int getMax(int[] array) {
        int max = 1;
        for(int i = 0 ; i < array.length; i++) {
            String str = String.valueOf(array[i]);
            if(max < str.length()) {
                max = str.length();
            }
        }
        return max;
    }
}
