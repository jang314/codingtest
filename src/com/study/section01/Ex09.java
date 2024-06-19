package com.study.section01;

import java.util.Scanner;

public class Ex09 {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        String input = sc.nextLine();

        System.out.println(mySolution(input));
    }

    private static int mySolution(String input) {
        StringBuffer digit = new StringBuffer();
        for(int i = 0; i < input.length(); i++) {
            if(Character.isDigit(input.charAt(i))) {
                digit.append(input.charAt(i));
            }
        }

        return Integer.parseInt(digit.toString());
    }
}
