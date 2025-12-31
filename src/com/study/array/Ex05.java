package com.study.array;

import java.util.Arrays;
import java.util.Scanner;

public class Ex05 {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int size = sc.nextInt();
        System.out.printf("%d", solution(size));
    }


    private static int solution(int n) {
        int answer = 0;
        int[] ch = new int[n+1];
        for(int i=2; i<=n; i++) {
            if(ch[i]==0) answer++;
            for(int j = i; j<=n;j = j+i) {
                ch[j] = 1;
            }
        }
        return answer;
    }

    private static int mySolution(int n) {
        int[] arr = new int[n+1];
        int count = 1;
        int i = 2;
        int min = 2;
        arr[0] = 1;
        arr[1] = 1;
        while(min < n) {
            if((i+1)%min==0) {
                arr[i+1] = 1;
            }

            boolean is = false;
            int j = 2;
            while(j<i) {
                j = (j%2==0) ? j+1 :j +2;
                if(i % j == 0) is=true; break;
            }
            if(!is) count++;
            i = (i%2==0) ? i+1 : i+2;
        }
        return count;
    }

    private static long mySolution2(int n) {
        int[] arrA = new int[n];
        int[] arrB = new int[n];
        int min = 0;

        for(int a = 2; a <= n; a++) {
            arrA[a-2] = a;
        }

        int j = 0;
        while(j < n-1) {
            int i = j;
            min = arrA[j];
            while(i < arrA.length-1) {
                arrB[j] = min;
                if(min == 0) break;
                if(arrA[i+1] % min == 0) {
                    arrA[i+1] = 0;
                }
                i++;
            }
            j++;
        }

        return Arrays.stream(arrA).filter(a->a>0).count();
    }

}
