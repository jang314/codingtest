package com.study.string;

import java.util.Scanner;

// 향산된 FOR문과 아스키 코드로 풀기
// 다문자 : a 65~90
// 소문자 97~122
// 대-소 = 32
/**
 * /**
 *  * 2. 대소문자 변환
 *  * 설명
 *  *
 *  * 대문자와 소문자가 같이 존재하는 문자열을 입력받아 대문자는 소문자로 소문자는 대문자로 변환하여 출력하는 프로그램을 작성하세요.
 *  *
 *  *
 *  * 입력
 *  * 첫 줄에 문자열이 입력된다. 문자열의 길이는 100을 넘지 않습니다.
 *  *
 *  * 문자열은 영어 알파벳으로만 구성되어 있습니다.
 * * */
public class Ex02 {
    public static void main(String[] args) {
        Scanner in=new Scanner(System.in);
        String input = in.nextLine();
        String result = mySolution(input);
        System.out.println(result);
        return ;
    }

    private static String mySolution(String str) {
        StringBuffer sb = new StringBuffer();
        for(int i = 0; i< str.length(); i++) {
            String upperCase = String.valueOf(str.charAt(i)).toUpperCase();
            if(String.valueOf(str.charAt(i)).equals(upperCase)) {
                sb.append(String.valueOf(str.charAt(i)).toLowerCase());
            } else {
                sb.append(String.valueOf(str.charAt(i)).toUpperCase());
            }
        }

        return sb.toString();
    }
}
