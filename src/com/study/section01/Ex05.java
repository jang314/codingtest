package com.study.section01;

import java.util.LinkedList;
import java.util.Queue;
import java.util.Scanner;
import java.util.Stack;
import java.util.regex.Pattern;
/**
 * 설명
 영어 알파벳과 특수문자로 구성된 문자열이 주어지면 영어 알파벳만 뒤집고,

 특수문자는 자기 자리에 그대로 있는 문자열을 만들어 출력하는 프로그램을 작성하세요.


 입력
 첫 줄에 길이가 100을 넘지 않는 문자열이 주어집니다.


 출력
 첫 줄에 알파벳만 뒤집힌 문자열을 출력합니다.


 예시 입력 1
 * */
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
