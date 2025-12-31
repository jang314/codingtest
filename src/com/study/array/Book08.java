package com.study.array;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.util.Arrays;
import java.util.Scanner;
import java.util.StringTokenizer;

public class Book08 {
    public static void main(String[] args) throws IOException {
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        StringTokenizer st = new StringTokenizer(br.readLine());

        int N = Integer.parseInt(st.nextToken());

        st = new StringTokenizer(br.readLine());

        int array[] = new int[N];

        for(int i = 0 ; i < N; i++) {
            array[i] = Integer.parseInt(st.nextToken());
        }

        Arrays.sort(array);
        int count = 0;

        for(int i = 2 ; i < N; i++) {
            int target = array[i];
            int sIdx = 0;
            int eIdx = i-1;

            while(sIdx < eIdx) {
                int sum = array[sIdx] + array[eIdx];
                if(sum == target) {
                    count++;
                    break;
                } else if (sum < target) {
                    sIdx++;
                } else {
                    eIdx++;
                }
            }
        }

        System.out.println(count);
    }
}
