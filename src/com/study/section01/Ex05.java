package com.study.section01;

import java.util.LinkedList;
import java.util.Queue;
import java.util.Scanner;
import java.util.Stack;
import java.util.regex.Pattern;

public class Ex05 {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        String input = sc.nextLine();

        Stack<Character> stack = new Stack<>();

        for(int i = input.length()-1; i >= 0; i--) {
            char c = input.charAt(i);
            if(Pattern.matches("^[a-z]$", String.valueOf(c))) {
                System.out.printf("push");
                stack.push(c);
            }
        }

        while(!stack.isEmpty()) {
            for(int i = 0 ; i < input.length(); i++) {
                if(!Pattern.matches("[a-z]", String.valueOf(input.charAt(i)))) {
                    System.out.print(input.charAt(i));
                } else {
                    System.out.print(stack.pop());
                }
            }
        }


    }
}
