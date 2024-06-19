package com.study.section01;

import java.util.ArrayList;
import java.util.List;
import java.util.Scanner;

public class Ex10 {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        String s = sc.nextLine();
        String t = sc.nextLine();

        int fromIdx = s.indexOf(t);

        List<Integer> list = new ArrayList<>();

        while(fromIdx != -1) {
            list.add(fromIdx);
            fromIdx = s.indexOf(t, fromIdx+1);
        }

        int find = 0;
        for(int i = 0 ; i< s.length(); i++) {
            while(find < list.size()) {
                if(i < find) {
                    System.out.printf("%d ", list.get(find) - i);
                    break;
                } else if(i == find) {
                    System.out.printf("0 ");
                    break;
                } else {
                    find++;
                }
            }

        }
    }
}
