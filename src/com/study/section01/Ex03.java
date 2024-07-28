package com.study.section01;

import java.util.Arrays;
import java.util.Scanner;
/**
 * 3. 문장 속 단어
 * 설명
 *
 * 한 개의 문장이 주어지면 그 문장 속에서 가장 긴 단어를 출력하는 프로그램을 작성하세요.
 *
 * 문장속의 각 단어는 공백으로 구분됩니다.
 *
 *
 * 입력
 * 첫 줄에 길이가 100을 넘지 않는 한 개의 문장이 주어집니다. 문장은 영어 알파벳으로만 구성되어 있습니다.
 * */
public class Ex03 {
    public static void main(String[] args) {
        Scanner in=new Scanner(System.in);
        String input = in.nextLine();
        String result = mySolution(input);
        System.out.println(result);
        return ;
    }

    private static String mySolution(String input) {
        String[] strArr = input.split(" ");
        int max = Arrays.stream(strArr).mapToInt(str -> str.length()).max().getAsInt();
        return Arrays.stream(strArr).filter(str -> str.length() == max).findFirst().get();
    }
    private static String solution1(String str) {
        String answer = "";
        int max = Integer.MIN_VALUE;
        String[] s = str.split(" ");
        for(String x : s) {
            int len = x.length();
            if(len>max) {
                max = len;
                answer = x;
            }
        }
        return answer;
    }
    private static String solution2(String str) {
        String answer = "";
        int max = Integer.MIN_VALUE, pos;

        while ((pos=str.indexOf(' '))!= -1) {
            String tmp = str.substring(0, pos);
            int len = tmp.length();
            if(len>max) {
                max = len;
                answer=tmp;
            }
            str = str.substring(pos+1);
        }
        if(str.length()>max)  answer = str;
        return answer;
    }
}
