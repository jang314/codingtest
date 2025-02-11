package com.study.section05;

import java.util.LinkedList;
import java.util.Queue;
import java.util.Scanner;

public class Ex07 {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        char[] priorities = sc.nextLine().toCharArray();
        String classes = sc.nextLine();

        for(int i = 0; i < priorities.length-1; i++) {
            int target = classes.indexOf(priorities[i]);
            int findNext = classes.indexOf(priorities[i+1]);
            if(target == -1 || findNext == -1 || target > findNext) {
                System.out.println("NO");
                return;
            }
        }
        System.out.println("YES");
    }
}
