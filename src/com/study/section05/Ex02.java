package com.study.section05;

import java.util.Scanner;
import java.util.Stack;

public class Ex02 {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        char[] array = sc.nextLine().toCharArray();
        Stack<Character> stack = new Stack<>();

        for(char arr : array) {
            if(arr == ')') {
                while(!stack.isEmpty()) {
                    if(stack.pop() == '(') break;
                }
            } else {
                stack.push(arr);
            }
        }

        char[] answer = new char[stack.size()];
        int i = 0;
        while(!stack.isEmpty()) {
            answer[i] = stack.pop();
            i++;
        }

        for(i=answer.length-1;i>=0 ; i--) {
            System.out.printf("%c", answer[i]);
        }
    }
}
