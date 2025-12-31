package com.study.string;

import java.util.Scanner;
/**
 * 설명
 *
 * 한 개의 문자열을 입력받고, 특정 문자를 입력받아 해당 특정문자가 입력받은 문자열에 몇 개 존재하는지 알아내는 프로그램을 작성하세요.
 *
 * 대소문자를 구분하지 않습니다.문자열의 길이는 100을 넘지 않습니다.
 *
 *
 * 입력
 * 첫 줄에 문자열이 주어지고, 두 번째 줄에 문자가 주어진다.
 *
 * 문자열은 영어 알파벳으로만 구성되어 있습니다.
 * */
public class Ex01 {
        public static void main(String[] args){
            Scanner in=new Scanner(System.in);
            String str1 = in.next();
            String str2 = in.next();

            int result = mySolution(str1, str2);
            System.out.printf("%d", result);

            int answer = solution(str1, str2.charAt(0));
            System.out.printf("answer = " + answer);
            return;

        }

        private static int mySolution(String str, String findStr) {
            int count = 0;
            String convertStr = str.toLowerCase();
            String convertFindStr = findStr.toLowerCase();

            while(true) {
                if(convertStr.contains(convertFindStr)) {
                    convertStr = convertStr.replaceFirst(convertFindStr, "");
                    count++;
                } else {
                    break;
                }
            }
            return count;
        }

        private static int solution(String str, char c) {
            int answer=0;
            str = str.toUpperCase();
            c = Character.toUpperCase(c);

        //            System.out.println(str);
            for(int i=0; i<str.length(); i++)
            {
                if(str.charAt(i)==c) {
                    answer++;
                }
            }
            return answer;
        }

    private static int solution2(String str, char c) {
        int answer=0;
        str = str.toUpperCase();
        c = Character.toUpperCase(c);
        int fromIdx = 0;

        while(fromIdx == -1) {

        }
        return answer;
    }
    private static int solution3(String str, char c) {
        int answer=0;
        str = str.toUpperCase();
        c = Character.toUpperCase(c);
        for(char x : str.toCharArray()) {
            if(x==c) {
                answer++;
            }
        }


        return answer;
    }

}
