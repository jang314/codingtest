package com.study.array;
import java.util.*;
import java.io.*;

public class Book04 {
    public static void main(String[] args) throws IOException {
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        StringTokenizer st = new StringTokenizer(br.readLine());

        int size = Integer.parseInt(st.nextToken());
        int row = Integer.parseInt(st.nextToken());

        // 1. 배열 입력 및 저장
        int[][] arrays = new int[size+1][size+1];
        int[][] S = new int[size+1][size+1];

        for(int i = 1; i <= size; i++) {
            st = new StringTokenizer(br.readLine());
            arrays[i][1] = Integer.parseInt(st.nextToken());
            S[i][1] = arrays[i][1];
            for(int j = 2; j <= size; j++) {
                arrays[i][j] = Integer.parseInt(st.nextToken());
                S[i][j] = S[i][j-1] + arrays[i][j]; // 구간 합 저장
            }
        }

        // 2. 질의 입력
        int[] result = new int[row];
        for(int i=0; i <row; i++) {
            st = new StringTokenizer(br.readLine());
            int x1 = Integer.parseInt(st.nextToken());
            int x2 = Integer.parseInt(st.nextToken());
            int y1 = Integer.parseInt(st.nextToken());
            int y2 = Integer.parseInt(st.nextToken());
            int sum = 0;
            for(int j=x1; j<=y1; j++) {
                sum += (S[j][y2] - S[j][x2-1]);
            }
            result[i] = sum;
        }

        for(int n : result) {
            System.out.println(n);
        }
    }
}
