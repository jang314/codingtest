package com.study.string;

import java.util.ArrayList;
import java.util.List;
import java.util.Scanner;
import java.util.stream.Collectors;
/**
 * 6. 중복문자제거
 * 설명
 *
 * 소문자로 된 한개의 문자열이 입력되면 중복된 문자를 제거하고 출력하는 프로그램을 작성하세요.
 *
 * 중복이 제거된 문자열의 각 문자는 원래 문자열의 순서를 유지합니다.
 *
 *
 * 입력
 * 첫 줄에 문자열이 입력됩니다. 문자열의 길이는 100을 넘지 않는다.
 *
 *
 * 출력
 * 첫 줄에 중복문자가 제거된 문자열을 출력합니다.
* */
public class Ex06 {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        String input = sc.nextLine();
        mySolution(input);
    }

    private static void mySolution(String input) {
        List<String> list = new ArrayList<>();

        for(int i = 0 ; i< input.length(); i++) {
            list.add(String.valueOf(input.charAt(i)));
        }

        list.stream().distinct().collect(Collectors.toList())
                .forEach(s -> System.out.print(s));
    }
    private static String mySolution1(String str){
        StringBuilder sb = new StringBuilder();
        String answer="";
        for(int i = 0; i<str.length(); i++) {
            if(i == str.indexOf(str.charAt(i))) {
                sb.append(str.charAt(i));
            }
//            System.out.println(str.charAt(i) + " : " + i + "," + str.indexOf(str.charAt(i)));
        }
        answer = sb.toString();
        return answer;
    }
}
