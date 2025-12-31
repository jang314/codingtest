package com.study.array;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.util.Scanner;
import java.util.StringTokenizer;

public class Book03 {
    public static void main(String[] args) throws IOException {
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        StringTokenizer st = new StringTokenizer(br.readLine());

        int size = Integer.parseInt(st.nextToken());
        int row = Integer.parseInt(st.nextToken());

        // 배열 입력
        st = new StringTokenizer(br.readLine());

        int array[] = new int[size + 1];
        int sumArray[] = new int[size + 1];

        array[1] = Integer.parseInt(st.nextToken());
        sumArray[1] = array[1];

        for(int i = 2; i <= size; i++) {
            array[i] = Integer.parseInt(st.nextToken());
            sumArray[i] = sumArray[i - 1] + array[i];
        }

        // 범위 입력
        int[] result = new int[row];
        for(int i = 0; i < row; i++) {
            st = new StringTokenizer(br.readLine());

            int sIdx = Integer.parseInt(st.nextToken());
            int eIdx = Integer.parseInt(st.nextToken());

            result[i] = sumArray[eIdx] - sumArray[sIdx-1];
        }

        for(int r : result) {
            System.out.println(r);
        }
    }
}
