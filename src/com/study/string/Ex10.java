package com.study.string;

import java.util.Scanner;

public class Ex10 {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        String input = sc.nextLine();
        String[] arr = input.split(" ");

        if(arr.length != 2) {
            return;
        }

        mySolution(arr[0], arr[1]);
    }

    private static int mySolution(String s, String t) {
        int fIdx = s.indexOf(t);
        int prev = -1;

        for(int i = 0 ; i < s.length(); i++) {
            int a = Math.abs(fIdx-i);
            int b = Math.abs(prev-i);
            int diff = prev == -1 ? a : a>b ? b:a;

            if(diff == 0) {
                prev = fIdx;
                fIdx += s.substring(i+1).indexOf(t) + 1;
            }
            System.out.printf("%d ", diff);
        }
        return 0;
    }
}
