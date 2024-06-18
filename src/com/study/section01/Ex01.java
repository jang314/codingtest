package com.study.section01;

import java.util.Scanner;

public class Ex01 {
        public static void main(String[] args){
            Scanner in=new Scanner(System.in);
            String str1 = in.nextLine();
            String str2 = in.nextLine();

            int result = mySolution(str1, str2);
            System.out.printf("%d", result);
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
}
