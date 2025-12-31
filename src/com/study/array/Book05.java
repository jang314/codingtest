package com.study.array;

import java.util.*;
import java.io.*;
import java.util.stream.Collectors;

public class Book05 {
    public static void main(String[] args) throws IOException {
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));

        StringTokenizer st = new StringTokenizer(br.readLine());
        int n = Integer.parseInt(st.nextToken());
        int M = Integer.parseInt(st.nextToken());

        int[] S = new int[n+1];
        int[] array = new int[M];

        st = new StringTokenizer(br.readLine());
        int count=0;
        S[1] = Integer.parseInt(st.nextToken());
        if(S[1] % M == 0) {
            count++;
        }
        array[S[1] % M]++;
        for(int i=2; i<=n; i++) {
            int input =  Integer.parseInt(st.nextToken());
            S[i] = S[i-1] + input;
            if(S[i] % M ==0) {
                count++;
            }
            array[S[i] % M]++;
        }

        for(int i =0 ;i<M;i++) {
            if(array[i] > 1) {
                // 경우의 수를 구함
                count += (array[i] * (array[i] - 1) / 2);
            }
        }

        System.out.println(count);
    }
}
