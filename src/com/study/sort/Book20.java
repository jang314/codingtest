package com.study.sort;

import java.util.Scanner;

public class Book20 {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int N = Integer.parseInt(sc.nextLine());
        int[] arrays = new int[N];
        for(int i = 0 ; i < N; i++) {
            arrays[i] = sc.nextInt();
        }

        partition(0, arrays.length-1, arrays);
        for (int i = 0 ; i < arrays.length; i++) {
            System.out.printf("%d ", arrays[i]);
        }
    }

    private static void partition(int lIdx, int rIdx, int[] arrays) {
        if(lIdx >= rIdx) {
            return;
        }

        int mid = (lIdx + rIdx)/ 2;

        partition(lIdx, mid, arrays);
        partition(mid+1, rIdx, arrays);
        merge(lIdx, mid, rIdx, arrays);


    }

    private static void merge(int sIdx, int mid, int eIdx, int[] arrays) {
        int[] sortArray = new int[arrays.length];
        int lIdx = sIdx;
        int rIdx = mid+1;

        int idx = 0;

        while(lIdx <= mid && rIdx <= eIdx) {
            if(arrays[lIdx] < arrays[rIdx]) {
                sortArray[idx++] = arrays[lIdx++];
            } else {
                sortArray[idx++] = arrays[rIdx++];
            }
        }

        while (lIdx<=mid) {
            sortArray[idx++] = arrays[lIdx++];
        }

        while(rIdx<=eIdx) {
            sortArray[idx++] = arrays[rIdx++];
        }

        idx = 0;
        for(int i = sIdx; i <= eIdx; i++) {
            arrays[i] = sortArray[idx++];
        }
    }

}
