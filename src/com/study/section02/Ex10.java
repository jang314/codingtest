package com.study.section02;

import java.util.Arrays;
import java.util.Scanner;

public class Ex10 {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int num = Integer.parseInt(sc.nextLine());
        int[][] arrays = new int[num+2][num+2];
        int[][] copyArrays = new int[num+2][num+2];

        for (int i = 1 ; i <= num; i++) {
            String input = sc.nextLine();
            int j = 1;
            for(String str : input.split(" ")) {
                arrays[i][j] = Integer.parseInt(str);
                j++;
            }
        }
        int count = 0;
        for(int i = 1 ; i< arrays.length-1; i++) {
            for (int j = 1; j<arrays[i].length-1; j++) {
                int idx = 0;
                int[] comps = new int[4];
                comps[idx++] = arrays[i-1][j];
                comps[idx++] = arrays[i+1][j];
                comps[idx++] = arrays[i][j-1];
                comps[idx++] = arrays[i][j+1];
                int max = Arrays.stream(comps).max().getAsInt();
                if(arrays[i][j] > max) {
                    count++;
                }
            }
        }

        System.out.printf("%d", count);
    }
}
