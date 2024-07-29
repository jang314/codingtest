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
        String input = sc.next();
        System.out.println(solution(input));
    }


    private static String solution(String str) {
        StringBuffer sb = new StringBuffer();
        int lt = 0 ;
        int gt = str.length() -1;
        char[] ch = str.toCharArray();
        while(lt < gt) {
            if(!Character.isAlphabetic(ch[lt])) {
                lt++;
            } else if(!Character.isAlphabetic(ch[gt])) {
                gt--;
            } else {
                char tmp = ch[lt];
                ch[lt] = ch[gt];
                ch[gt] = tmp;
                lt++;
                gt--;
            }
        }
        for(char c : ch) {
            sb.append(c);
        }
        return sb.toString();
    }

}
