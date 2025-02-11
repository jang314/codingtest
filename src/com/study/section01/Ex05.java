package com.study.section01;

import java.util.*;
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
        char[] array = input.toCharArray();
        char[] answer = new char[array.length];
        int eIdx = array.length-1;

        for(int i = 0; i< array.length; i++) {
            if(!Character.isAlphabetic(array[i])) {
                answer[i] = array[i];
            } else {
                while(!Character.isAlphabetic(array[eIdx])) {
                    eIdx--;
                }
                answer[i] = array[eIdx];
                eIdx--;
            }
        }
        for(char aw : answer) {
            System.out.printf("%c", aw);
        }
    }
}
