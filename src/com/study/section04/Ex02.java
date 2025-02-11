package com.study.section04;

import java.util.Arrays;
import java.util.HashMap;
import java.util.Map;
import java.util.Scanner;

public class Ex02 {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        char[] firstArray = sc.nextLine().toCharArray();
        char[] secondArray = sc.nextLine().toCharArray();
        StringBuffer firstSb = new StringBuffer();
        StringBuffer secondSb = new StringBuffer();
        Arrays.sort(firstArray);
        Arrays.sort(secondArray);

        for(char ch : firstArray) {
            firstSb.append(ch);
        }

        for(char ch: secondArray) {
            secondSb.append(ch);
        }

        System.out.printf("%s", firstSb.toString().equals(secondSb.toString()) ? "YES" : "NO");
    }
}
