package com.study.section01;

import java.util.Scanner;

public class Ex12 {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        String total = sc.next();
        String input = sc.next();
        mySolution(Integer.parseInt(total),input);
    }

    private static String mySolution(int total, String input) {
        StringBuffer sb = new StringBuffer();
        String[][] array = new String[total][7];
        String[] strArray = new String[total];

        input = input.replaceAll("#", "1");
        input = input.replaceAll("\\*","0");


        for(int i = 0 ; i < total; i++) {
            strArray[i] = input.substring(i * 7, ((i+1)*7));
            System.out.print((char) Integer.parseInt(strArray[i], 2));

        }

        return sb.toString();
    }
}
