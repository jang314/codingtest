package com.study.section01;

import java.util.Scanner;

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
