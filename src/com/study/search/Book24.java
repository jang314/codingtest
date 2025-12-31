package com.study.search;

import java.util.*;

public class Book24 {
    private static int N ;
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        N = Integer.parseInt(sc.nextLine());

        dfs(2, 1);
        dfs(3, 1);
        dfs(5, 1);
        dfs(7, 1);
    }

    private static void dfs(double number, int jarisu) {
        if(jarisu == N) {
            int count =0;
            for(int m = 2; m < number / 2; m++) {
                if(number % m == 0) {
                    count++;
                    break;
                }
            }
            if(count==0) {
                System.out.println(number);
                return;
            }
        }
        for(int n = 1; n < 10; n++) {
            double target = (Math.pow(10, 1) * number) + n;
            int count =0;
            for(int m = 2; m < target / 2; m++) {
                if(target % m == 0) {
                    count++;
                    break;
                }
            }
            if(count==0) {
                dfs(target, jarisu+1);
            }
        }
    }

}
