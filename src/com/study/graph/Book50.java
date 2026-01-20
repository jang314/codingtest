package com.study.graph;

import java.util.Scanner;

/**
 * 집합 표현하기
 * */
public class Book50 {
    private static int[] arrays;
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int n = sc.nextInt();
        int m = sc.nextInt();

        arrays = new int[n+1];
        sc.nextLine();

        for(int i = 0; i<=n; i++) {
            arrays[i] = i;
        }


        for(int i = 0 ; i < m; i++) {
            int idx = sc.nextInt();
            int a = sc.nextInt();
            int b = sc.nextInt();

            if(idx == 0) {
                union(a, b);
            } else {
                if(checkSame(a, b)) {
                    System.out.println("YES");
                } else {
                    System.out.println("NO");
                }
            }
        }
    }

    private static boolean checkSame(int a, int b) {
        a = find(a);
        b = find(b);
        if(a==b) {
            return true;
        }
        return false;
    }

    private static void union(int a, int b) {
        a = find(a);
        b = find(b);

        if(a != b) {
            arrays[b] = a;
        }
    }

    private static int find(int a) {
        if(arrays[a] == a) {
            return a;
        } else {
            return arrays[a] = find(arrays[a]);
        }
    }
}
