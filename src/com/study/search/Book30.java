package com.study.search;

import java.util.*;
import java.io.*;

/**
 * 이진 탐색
 * */
public class Book30 {
    public static void main(String[] args) throws IOException {
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        StringTokenizer st = new StringTokenizer(br.readLine());

        int N = Integer.parseInt(st.nextToken());
        int M = Integer.parseInt(st.nextToken());

        int[] arrays = new int[N];

        // Input
        st = new StringTokenizer(br.readLine());
        for(int i = 0 ; i < arrays.length; i++) {
            arrays[i] = Integer.parseInt(st.nextToken());
        }

        int sIdx = arrays[N-1];
        int eIdx = Arrays.stream(arrays).sum();

        while(sIdx <= eIdx) {
            int target = (sIdx + eIdx) / 2;
            int count = 0; // 블루레이 갯수
            int sum = 0 ;

            for(int i = 0 ; i < arrays.length; i++) {
                if((arrays[i] + sum) > target) {
                    sum = 0;
                    count++;
                }
                sum+=arrays[i];
            }

            if(count < M) {
                eIdx = target - 1;
            } else {
                sIdx = target + 1;
            }
        }

        System.out.printf("%d ", sIdx);
    }
}
