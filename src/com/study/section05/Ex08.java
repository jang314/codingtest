package com.study.section05;

import java.util.LinkedList;
import java.util.Queue;
import java.util.Scanner;

public class Ex08 {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int n = sc.nextInt();
        int m = sc.nextInt();
        sc.nextLine();

        int[] arrays = new int[n];
        for(int i = 0 ; i<n; i++) {
            arrays[i] = sc.nextInt();
        }

        Queue<Integer> que = new LinkedList<>();

        for(int i = 0; i < arrays.length; i++) {
            que.add(i);
        }

        int answer = 0;
        while(!que.isEmpty()) {
            int count = 1;
            int target = que.poll();
            for(int i=1; i <= que.size(); i++) {
                int comp = que.poll();
                if(arrays[target] < arrays[comp]) {
                    count = 0;
                }
                que.add(comp);
            }
            if(count == 0) {
                que.add(target);
            } else {
                answer++;
                if(target == m) break;
            }
        }

        System.out.println(answer);
    }
}
