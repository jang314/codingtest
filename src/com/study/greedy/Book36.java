package com.study.greedy;

import java.util.ArrayList;
import java.util.List;
import java.util.Scanner;

/**
 * 최솟값을 만드는 괄호 배치 찾기
 * */
public class Book36 {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        String input = sc.nextLine();
        String[] arrays = input.split("-");

        int sum =0;
        for(int i = 0 ; i < arrays.length; i++) {
            if(arrays[i].contains("+")) {
                int tmp = 0;
                String[] strs = arrays[i].split("\\+");

                for(String str : strs) {
                    tmp+=Integer.parseInt(str);
                }
                sum-=tmp;
            } else {
                if(i == 0) {
                    sum+=Integer.parseInt(arrays[i]);
                } else {
                    sum-=Integer.parseInt(arrays[i]);
                }
            }
        }

        System.out.printf("%d ", sum);
    }

}
