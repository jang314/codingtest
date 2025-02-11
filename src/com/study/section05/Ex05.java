package com.study.section05;

import java.util.Scanner;
import java.util.Stack;

public class Ex05 {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        char[] bars = sc.nextLine().toCharArray();
        Stack<Character> stack = new Stack<>();

        int count = 0;
        int i =0;
        while(i < bars.length) {
            if(bars[i] == '(') {
                if(bars[i+1] == ')') {
                    i+=2;
                    count+=stack.size();
                } else {
                    stack.push(bars[i]);
                    i++;
                }
            } else {
                count++;
                stack.pop();
                i++;
            }

        }
        System.out.println(count);
    }
}
