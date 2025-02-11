package com.study.section05;

import java.util.LinkedList;
import java.util.Queue;
import java.util.Scanner;

public class Ex06 {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int n = sc.nextInt();
        int k = sc.nextInt();
        Queue<Integer> queue = new LinkedList<>();

        for(int i = 1; i <= n; i++) {
            queue.add(i);
        }

        int count = 1;
        int number = 0;
        while(queue.size() > 1) {
            number = queue.poll();
            if(count != k) {
                queue.add(number);
            } else {
                count=0;
            }
            count++;
        }

        System.out.printf("%d", queue.poll());
    }
}
