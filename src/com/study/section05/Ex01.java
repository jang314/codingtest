package com.study.section05;

import java.util.Scanner;
import java.util.Stack;

public class Ex01 {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        char[] array = sc.nextLine().toCharArray();

        Stack<Character> stack = new Stack<>();

        for(char arr : array) {
            if(arr == '(') {
                stack.push(arr);
            } else {
                if(!stack.isEmpty()) {
                    stack.pop();
                } else {
                    System.out.println("NO");
                    return;
                }
            }
        }

        System.out.printf("%s", stack.isEmpty() ? "YES" : "NO");
    }
}
