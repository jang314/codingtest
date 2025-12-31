package com.study.section06;

import java.util.*;
import java.io.*;

public class Book14 {
    public static void main(String[] args)  {
        Scanner sc = new Scanner(System.in);
        int N = Integer.parseInt(sc.nextLine());
        int[] x = new int[N];

        for(int i = 0; i < N; i++) {
            x[i] = Integer.parseInt(sc.nextLine());
        }

        PriorityQueue<Integer> pq = new PriorityQueue<Integer>((o1, o2) -> {
            int num1 = Math.abs(o1);
            int num2 = Math.abs(o2);

            if(num2 - num1 == 0) {
                return o1-o2;
            }

            return num1-num2;
        });

        for(int i = 0; i< x.length; i++) {
            if(x[i] == 0) {
                int num = pq.isEmpty() ? 0 : pq.poll();
                System.out.printf("%d \n", num);
            } else {
                pq.offer(x[i]);
            }
        }
    }
}
