package com.study.section01;

import java.util.Scanner;

public class Ex11 {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        String input = sc.nextLine();

        int count = 1;
        char ch = input.charAt(0);
        StringBuffer sb = new StringBuffer();
        for(int i = 0 ; i < input.length(); i++) {
            if(ch == input.charAt(i)) {
                count++;
            } else {
                sb.append(ch);
                if(count >1) {
                    sb.append(count);
                }
                ch = input.charAt(i);
                count = 1;
            }
        }
        sb.append(ch);
        if(count >1) {
            sb.append(count);
        }
        System.out.print(sb.toString());
    }
}
