package com.study.array;

import java.util.Scanner;

public class Book01 {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int inputA = sc.nextInt();
        sc.nextLine();
        String inputB = sc.nextLine();

        char[] array = inputB.toCharArray();
        int result = 0;

        for(char arr : array) {
            result += Integer.parseInt(String.valueOf(arr));
        }

        System.out.println(result);
    }
}
