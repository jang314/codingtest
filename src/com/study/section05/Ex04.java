package com.study.section05;

import java.util.Comparator;
import java.util.Scanner;
import java.util.Stack;

public class Ex04 {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        char[] array = sc.nextLine().toCharArray();

        Stack<Integer> stack = new Stack<>();
        for (char arr : array) {
            if(Character.isDigit(arr)) {
                stack.push(Integer.parseInt(String.valueOf(arr)));
            } else {
                int num1 = stack.pop();
                int num2 = stack.pop();
                int result = calculate(num2, num1, arr);
                stack.push(result);
            }
        }

        if(!stack.isEmpty()) {
            int answer = stack.pop();
            System.out.println(answer);
        }
    }

    private static int calculate(int num1, int num2, char op) {
        int result = 0;
        switch (op) {
            case '+' : result = num1 + num2; break;
            case '-' : result = num1 - num2; break;
            case '/' : result = num1 / num2; break;
            case '*' : result = num1 * num2; break;
        }

        return result;
    }

}
