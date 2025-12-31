package com.study.array;

import java.util.Arrays;
import java.util.Scanner;

public class Ex06 {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int n = Integer.parseInt(sc.nextLine());
        String input = sc.nextLine();
        Arrays.stream(input.split(" "))
                .map(arr -> new StringBuffer(arr))
                .map(sb -> sb.reverse())
                .mapToInt(arr -> Integer.parseInt(arr.toString()))
                .filter(arr -> isPrimaryNum(arr))
                .forEach(arr -> System.out.printf("%d ", arr));


    }

    private static boolean isPrimaryNum(int num) {
        if(num == 1) return false;
        for(int i=2; i<num; i++) {
            if(num%i==0) return false;
        }
        return true;
    }
}
