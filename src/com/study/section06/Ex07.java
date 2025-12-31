package com.study.section06;

import java.util.*;

public class Ex07 {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int size = sc.nextInt();
        int[][] arrays = new int[size][2];

        for(int i = 0 ; i < size; i++) {
            for(int j = 0 ; j < arrays[i].length; j++) {
                arrays[i][j] = sc.nextInt();
            }
            sc.nextLine();
        }

        // 정렬 기준 x, x값이 같을 경우 y
        // x좌표 : arrays[i][0], y좌표 : arrays[i][1];
        Arrays.sort(arrays, (arr1, arr2) -> (arr1[0] - arr2[0] == 0) ? arr1[1] - arr2[1] : arr1[0] - arr2[0]);

        for (int i = 0 ; i < arrays.length; i++) {
            for(int j = 0 ; j  < arrays[i].length; j++) {
                System.out.printf("%d ", arrays[i][j]);
            }
            System.out.println("");
        }
    }

}
