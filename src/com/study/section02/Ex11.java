package com.study.section02;

import java.util.Arrays;
import java.util.Collections;
import java.util.Scanner;
import java.util.stream.Collectors;

public class Ex11 {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int num = Integer.parseInt(sc.nextLine());
        int[][] arrays = new int[num][5];
        int[][] retArrays = new int[num][5];

        for(int i = 0; i<num; i++) {
            String input= sc.nextLine();
            int[] splitArray = Arrays.stream(input.split(" ")).mapToInt(Integer::parseInt).toArray();
            int j=0;
            for(int array : splitArray) {
                arrays[j][i] = array;
                j++;
            }
        }


        int[] result = new int[100];
        int idx = 0;
        for(int i = 0 ; i < num ; i++) {
            int[] dist = Arrays.stream(arrays[i])
                    .distinct().toArray();
            long count = 0;
            for(int j = 0 ; j < num; j++) {
                int target = arrays[i][j];
                count += Arrays.stream(dist)
                        .filter(d -> d != target)
                        .count();

            }
            if(count > 0) {
                result[idx++] = i;
            }
        }

        Arrays.stream(result)
                .filter(r -> r>0)
                .forEach(r->System.out.printf("%d " , r));
    }
}
