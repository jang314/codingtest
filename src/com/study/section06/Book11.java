package com.study.section06;

import java.util.Scanner;
import java.util.Stack;

public class Book11 {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int N = sc.nextInt();
        sc.nextLine();

        int[] array = new int[N + 1];
        for (int i = 1; i <= N; i++) {
            array[i] = sc.nextInt();
            sc.nextLine();
        }

        Stack<Integer> stack = new Stack<>();
        StringBuffer print = new StringBuffer();

        int idx = 1;
        int num = 1;

        while(idx <= N) {
            int target = array[idx];
            if(stack.isEmpty() || stack.peek() < target) {
                stack.push(num++);
                print.append("+ \n");
            } else if(stack.peek() == target) {
                stack.pop();
                idx++;
                print.append("- \n");
            } else {
                System.out.println("NO");
                print = new StringBuffer();
                break;
            }
        }

        System.out.println(print.toString());
    }
}