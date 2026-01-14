package com.study.greedy;

import java.util.PriorityQueue;
import java.util.Scanner;

/**
 * 수를 묶어 최대값 만들기
 * */
public class Book34 {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int N = Integer.parseInt(sc.nextLine());


        PriorityQueue<Integer> plusPq = new PriorityQueue<>((n1,n2) -> n2-n1);
        PriorityQueue<Integer> minusPq = new PriorityQueue<>();

        int oneCount = 0;
        int zeroCount = 0;

       for(int i=0; i<N; i++) {
           int number = Integer.parseInt(sc.nextLine());
           if(number > 1) {
               plusPq.add(number);
           } else if(number < 0) {
               minusPq.add(number);
           } else if(number == 1) {
               oneCount++;
           } else if(number == 0) {
               zeroCount++;
           }
       }
       int answer = 0;
       while(!plusPq.isEmpty()) {
           if (plusPq.size() == 1) {
               answer+= plusPq.poll();
               break;
           }

           int n1 = plusPq.poll();
           int n2 = plusPq.poll();
            answer+= (n1*n2);
       }

       while(!minusPq.isEmpty()) {
           if(minusPq.size() == 1) {
               int num = minusPq.poll();
               if(zeroCount == 0) {
                   answer+=num;
               }
               break;
           }
           int n1 = minusPq.poll();
           int n2 = minusPq.poll();

           answer+=(n1*n2);
       }

       answer+= oneCount;

        System.out.printf("%d", answer);
    }
}
