package com.study.section01;

import java.util.Arrays;
import java.util.Scanner;

public class Ex03 {
    public static void main(String[] args) {
        Scanner in=new Scanner(System.in);
        String input = in.nextLine();
        String result = mySolution(input);
        System.out.println(result);
        return ;
    }

    private static String mySolution(String input) {
        String[] strArr = input.split(" ");
        int max = Arrays.stream(strArr).mapToInt(str -> str.length()).max().getAsInt();
        return Arrays.stream(strArr).filter(str -> str.length() == max).findFirst().get();
    }
}
