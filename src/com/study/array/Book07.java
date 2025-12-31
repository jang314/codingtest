package com.study.array;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.util.Arrays;
import java.util.StringTokenizer;

public class Book07 {
    public static void main(String[] args) throws IOException {
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        StringTokenizer st = new StringTokenizer(br.readLine());

        int N = Integer.parseInt(st.nextToken());
        st = new StringTokenizer(br.readLine());

        int M = Integer.parseInt(st.nextToken());
        st = new StringTokenizer(br.readLine());

        int array[] = new int[N+1];
        int S[]= new int[N+1];


        // 구간 합 저장
        for(int i = 1; i <= N; i++) {
            array[i] = Integer.parseInt(st.nextToken());
        }

        int count = 0;
        int sIdx = 1;
        int eIdx = N;

        Arrays.sort(array);

        while(eIdx > sIdx) {
            int sum = array[sIdx] + array[eIdx];
            if(sum == M) {
                count++;
                sIdx++;
            } else if (sum < M) {
                sIdx++;
            } else {
                eIdx--;
            }
        }

        System.out.println(count);

    }
}
