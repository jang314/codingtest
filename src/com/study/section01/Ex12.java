package com.study.section01;

import java.util.Scanner;

public class Ex12 {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        String input = sc.nextLine();
        StringBuffer sb = new StringBuffer();
        for(int i = 0 ; i<input.length(); i++) {
            sb.append(input.charAt(i) == '#' ? 1: input.charAt(i) == '*' ? 0 : "");
        }

        String s = Integer.toBinaryString(Integer.parseInt(sb.toString()));
        System.out.printf(s);

    }
}
