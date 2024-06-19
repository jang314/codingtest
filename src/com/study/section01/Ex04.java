package com.study.section01;

import java.util.Arrays;
import java.util.Scanner;

public class Ex04 {
    public static void main(String[] args) {
        Scanner in=new Scanner(System.in);

        int input1 = in.nextInt();

        if(input1 < 3 || input1 > 20) {
            System.out.println("System Error");
            return ;
        }

        String[] strs = new String[input1];
        int i=input1+1;
        while(i > 0) {
            i--;
            strs[i] = in.nextLine();
        }

//        mySolution(strs);
    }

    private static void mySolution(String[] target) {
        Arrays.stream(target).forEach(str -> {
            int size = str.length();
            for(int i = size-1; i >= 0 ; i--) {
                if(i==0) {
                    System.out.println(str.charAt(i));
                } else {
                    System.out.print(str.charAt(i));
                }
            }
        });
    }
}
