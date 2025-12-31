package com.study.string;

import java.util.Scanner;

public class Ex07 {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        String input = sc.nextLine();

        String result = mySolution(input);
        System.out.printf(result);
    }

    private static String mySolution(String input) {
        StringBuffer reverseStr = new StringBuffer();
        for(int i = input.length()-1; i >= 0; i--) {
            reverseStr.append(input.charAt(i));
        }
        if(reverseStr.toString().toLowerCase().equals(input.toLowerCase()) ){
            return "YES";
        } else {
            return "NO";
        }
    }
}
