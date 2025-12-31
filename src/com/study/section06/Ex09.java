package com.study.section06;

import java.util.Arrays;
import java.util.Comparator;
import java.util.Scanner;

public class Ex09 {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int n = sc.nextInt();
        int m = sc.nextInt();

        sc.nextLine();

        int[] arrays = new int[n];

        for(int i = 0; i < n; i++) {
            arrays[i] = sc.nextInt();
        }

        System.out.printf("%d", solution(n, m, arrays));

    }

    private static int my_solution (int n, int m, int[] arrays) {
        int min = Arrays.stream(arrays).max().getAsInt();
        int max = Arrays.stream(arrays).sum();
        int k = 1;

        while(min <= max) {
            k = 1;
            int sum = 0;

            for(int i = 0 ; i < arrays.length; i++) {
                if(sum + arrays[i] <= max) {
                    sum += arrays[i];
                } else {
                    k++;
                    sum = arrays[i];
                }
            }

            if(k==m) break;
            max = (k < m) ? ((min+max) / 2) : min+max;
        }

        System.out.println(max);
        return max;
    }



    private static int solution(int n, int m, int[] arr) {
        int answer = 0;
        int lt = Arrays.stream(arr).max().getAsInt();
        int rt = Arrays.stream(arr).sum();

        while(lt <= rt) {
            int mid = (lt + rt) / 2;
            if(count(arr, mid) <= m) {
                answer = mid;
                rt = mid-1;
            } else {
                lt = mid+1;
            }
        }
        return answer;
    }
    private static int count(int[] arr, int capacity) {
        int cnt = 1; // DVD 장수
        int sum = 0;
        for(int n : arr) {
            if(sum+n <= capacity) {
                sum+=n;
            } else {
                cnt++;
                sum = n;
            }
        }

        return cnt;
    }
}
