package com.study.section04;

import java.util.Arrays;
import java.util.HashMap;
import java.util.Map;
import java.util.Scanner;

public class Ex04 {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        char[] firstRow = sc.nextLine().toCharArray();
        char[] secondRow = sc.nextLine().toCharArray();
        Arrays.sort(secondRow);

        int sIdx = 0;
        int eIdx = secondRow.length-1;


        int count=0;
        for(int i = eIdx; i < firstRow.length; i++) {
            count++;
            char[] copies = Arrays.copyOfRange(firstRow, sIdx, i + 1);
            Arrays.sort(copies);
            for(int j = 0; j < secondRow.length; j++) {
                if(copies[j] != secondRow[j]) {
                    count--;
                    break;
                }
            }
            sIdx++;
        }
        System.out.printf("%d", count);
    }
}
