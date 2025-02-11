package com.study.section03;

import java.util.ArrayList;
import java.util.List;
import java.util.PriorityQueue;
import java.util.Scanner;

public class Ex01 {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        PriorityQueue<Integer> pq = new PriorityQueue<>();

        int n1 = Integer.parseInt(sc.nextLine());
        for(int i=0; i<n1; i++) {
            pq.add(sc.nextInt());
        }
        sc.nextLine();

        int n2 = Integer.parseInt(sc.nextLine());
        for(int i=0; i<n2; i++) {
            pq.add(sc.nextInt());
        }

        while(!pq.isEmpty()) {
            System.out.printf("%d ", pq.poll());
        }
    }
}
