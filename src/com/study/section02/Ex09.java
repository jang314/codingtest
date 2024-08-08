package com.study.section02;

import java.util.Arrays;
import java.util.Scanner;

public class Ex09 {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int num = Integer.parseInt(sc.nextLine());
        int[][] arrays = new int[num][num];

        // input
        for(int i = 0; i<num;i++) {
            int j= 0;
            String input = sc.nextLine();
            for(String s : input.split(" ")) {
                arrays[i][j] = Integer.parseInt(s);
                j++;
            }
        }

        int digA =0;
        int digB =0;
        int[] sum = new int[(num*2)+2];

        int idx = 0;
        for(int i = 0; i < arrays.length; i++) {
            int rows = 0;
            int cols = 0;
            for(int j = num-1; j>=0; j--) {
                rows += arrays[i][j];
                cols += arrays[j][i];
            }
            sum[idx++] = rows;
            sum[idx++] = cols;
            digA += arrays[i][i];
            digB += arrays[i][num-i-1];  // (0,4), (1,3)
        }
        sum[idx++] = digA;
        sum[idx++] = digB;



        int max = Arrays.stream(sum).max().getAsInt();
        System.out.printf("%d", max);
    }
}
