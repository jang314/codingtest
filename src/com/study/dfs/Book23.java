package com.study.dfs;
import java.io.*;
import java.sql.Array;
import java.util.*;

public class Book23 {

    public static void main(String[] args)  {
        Scanner sc = new Scanner(System.in);
        int node = sc.nextInt();
        int edge = sc.nextInt();

        int[] isVisit = new int[node+1];
        sc.nextLine();

        List<List<Integer>> arrays = new ArrayList<>();

        for(int i =0 ; i <= node; i++) {
            arrays.add(new ArrayList<>());
        }

        for(int i = 1 ; i<=edge; i++) {
            int a = sc.nextInt();
            int b = sc.nextInt();
            sc.nextLine();

            arrays.get(a).add(b);
            arrays.get(b).add(a);
        }

        Stack<Integer> stack = new Stack<>();
        int idx = 1;
        int target = idx;

        int count = 0;
        stack.push(target);
        // 시작점 지정
        while(idx <= node) {
            target = stack.pop();

            if(isVisit[target] == 0) {
                count++;
                stack.push(target);
                isVisit[target] = 1;
            }

            for(int i =0 ; i < arrays.get(target).size(); i++) {
                if(isVisit[arrays.get(target).get(i)]==0) {
                    stack.push(arrays.get(target).get(i));
                    isVisit[arrays.get(target).get(i)] = 1;
                }
            }

            if(stack.isEmpty()) {
                idx++;
                stack.push(idx);
            }
        }

        System.out.printf("%d", count);
    }
}
