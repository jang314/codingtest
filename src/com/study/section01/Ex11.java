package com.study.section01;

import java.util.Scanner;

public class Ex11 {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        String input = sc.nextLine();

        System.out.print(mySolution(input));
    }
    private static String mySolution(String input) {
        StringBuffer sb = new StringBuffer();
        char ch = input.charAt(0);
        int count = 1;

        for(int i = 1; i< input.length(); i++) {
            if(input.charAt(i) != ch) {
                sb.append(ch);
                if(count > 1)   sb.append(count);
                ch = input.charAt(i);
                count=1;
            }else {
                count++;
            }
        }
        sb.append(ch);
        if(count > 1)   sb.append(count);
        return sb.toString();
    }
}
