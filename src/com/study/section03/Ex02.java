package com.study.section03;

import java.util.*;

public class Ex02 {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int num1 = sc.nextInt();
        int[] rowA = new int[num1];

        for(int i = 0; i< num1; i++) {
            rowA[i]=sc.nextInt();
        }

        Arrays.sort(rowA);
        sc.nextLine();

        List<Integer> list = new ArrayList<>();

        int num2 = sc.nextInt();
        int[] rowB = new int[num2];

        for(int i=0; i<num2;i++) {
            rowB[i] = sc.nextInt();;
        }
        Arrays.sort(rowB);

        int sIdx = 0;
        int eIdx = 0;

        while(sIdx < num1 && eIdx < num2) {
            if(rowA[sIdx] < rowB[eIdx]) {
                sIdx++;
            } else if(rowA[sIdx] > rowB[eIdx]) {
                eIdx++;
            } else {
                list.add(rowA[sIdx]);
                sIdx++;
                eIdx++;
            }
        }

        for(int num : list) {
            System.out.printf("%d ", num);
        }
    }
}
