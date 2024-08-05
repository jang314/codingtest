package com.study.section02;

import java.util.ArrayList;
import java.util.List;
import java.util.Scanner;

public class Ex05 {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        List<Integer> list = new ArrayList<>();
        int size = sc.nextInt();

        if(size >= 2) {
            list.add(2);
        }
        int n = 3;
        while(n <= size) {
            boolean is = false;
            int i = 2;
            while(i < n) {
                if(n%i == 0) {
                    is = true;
                    break;
                }
                i++;
            }
            if(!is) list.add(n);
        }
    }
}
