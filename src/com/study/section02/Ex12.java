package com.study.section02;

import com.sun.org.apache.bcel.internal.classfile.SourceFile;

import java.util.*;

public class Ex12 {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        String input = sc.nextLine();
        int stds = Integer.parseInt(input.split(" ")[0]);
        int tests = Integer.parseInt(input.split(" ")[1]);

        int arrays[][] = new int[tests+1][stds+1];
        long answer = 0;
        int[] init = new int[stds+1];

        for(int i = 1; i < arrays.length; i++) {
            for(int j = 1; j < arrays[i].length; j++) {
                arrays[i][j] = sc.nextInt();
                init[j] = j;
            }
        }

        for(int num = 1; num < stds + 1; num++) {
            int[] copy = Arrays.copyOf(init, init.length);
            for(int i = 1; i < arrays.length; i++) {
                int j = 1;
                while(j < arrays[i].length) {
                    int target = arrays[i][j];
                    copy[target] = 0;
                    if(num == target) break;
                    j++;
                }
            }
            long count = Arrays.stream(copy).filter(cp -> cp!=0).count();
            answer += count;
       }

        System.out.printf("%d", answer);
    }
}
