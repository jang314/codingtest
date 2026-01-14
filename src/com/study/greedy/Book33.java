package com.study.greedy;

import java.util.PriorityQueue;
import java.util.Scanner;

/**
* 33.카드 정렬하기
* */
public class Book33 {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int N = Integer.parseInt(sc.nextLine());
        PriorityQueue<Integer> queue = new PriorityQueue<>();

        for(int i = 0 ; i < N; i++) {
            int inputNumber = Integer.parseInt(sc.nextLine());
            queue.add(inputNumber);
        }

        int answer = 0;
        int sum = 0 ;
        while(!queue.isEmpty()) {
            if(queue.size()==1) {
                answer = queue.poll();
                break;
            }
            int A = queue.poll();
            int B = queue.poll();
            sum += (A+B);
            queue.add(sum);
        }
        System.out.printf("%d" , answer);
    }
}
