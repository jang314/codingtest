package com.study.greedy;

import java.util.PriorityQueue;
import java.util.Scanner;

/**
 * 회의실 배정하기
 * */
public class Book35 {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int N = Integer.parseInt(sc.nextLine());
        PriorityQueue<int[]> pq = new PriorityQueue<int[]>((arr1, arr2) -> {
            if(arr1[1] == arr2[1]) {
                return arr1[0]-arr2[0];
            }
            return arr1[1]-arr2[1];
        });

        for(int i = 0 ; i < N; i++) {
            int[] arrays = new int[2];
            arrays[0] = sc.nextInt();
            arrays[1] = sc.nextInt();;
            pq.add(arrays);
            sc.nextLine();
        }

        int endTime = 0 ;
        int count = 0;
        while(!pq.isEmpty()) {
            int[] target = pq.poll();
            int startTime = target[0];

            if(startTime>=endTime) {
                count++;
                endTime = target[1];
            }
        }

        System.out.printf("%d ", count);
    }
}
