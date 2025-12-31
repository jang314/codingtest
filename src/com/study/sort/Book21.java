package com.study.sort;

import java.util.Scanner;

public class Book21 {
    private static int result = 0;

    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        int N = Integer.parseInt(sc.nextLine());

        int[] arrays = new int[N];

        for(int i = 0 ; i < N; i++) {
            arrays[i] = sc.nextInt();
        }

        partition(0, arrays.length-1, arrays);

        System.out.printf("%d ", result);
    }

    private static void partition(int left, int right, int[] arrays) {
        if(left >= right) {
            return ;
        }
        int mid = (left + right) / 2;

        partition(left, mid, arrays);
        partition(mid+1, right, arrays);

        mergeSort(left, mid, right, arrays);
    }

    private static void mergeSort(int left, int mid,int right, int[] arrays) {
        int[] sortArray = new int[arrays.length];
        int lIdx = left;
        int rIdx = mid+1;

        int idx = left;
        while(lIdx <= mid && rIdx <= right) {
            if(arrays[lIdx] < arrays[rIdx]) {
                sortArray[idx++] = arrays[lIdx++];
            } else {
                result += (rIdx-idx);
                sortArray[idx++] = arrays[rIdx++];
            }
        }

        while(lIdx<=mid) {
            sortArray[idx++] = arrays[lIdx++];
        }

        while(rIdx<=right) {
            sortArray[idx++] = arrays[rIdx++];
        }

        for(int i = left; i <= right; i++) {
            arrays[i] = sortArray[i];
        }
    }
}
