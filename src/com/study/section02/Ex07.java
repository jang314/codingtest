package com.study.section02;

import java.util.Arrays;
import java.util.Scanner;

public class Ex07 {
    public static void main(String[] args) {
        Scanner sc= new Scanner(System.in);
        String n = sc.nextLine();
        String input = sc.nextLine();
        int[] array = Arrays.stream(input.split(" ")).mapToInt(arr -> Integer.parseInt(arr)).toArray();
        int score = 0;
        int total = 0;
        for(int i = 0 ; i < array.length; i++) {
            if(array[i] > 0) {
                total += score+1;
                score++;
            } else {
                score = 0;
            }
        }
        System.out.printf("%d", total);
    }
}
