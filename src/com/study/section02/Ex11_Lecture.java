package com.study.section02;

import com.study.Main;

import java.util.Scanner;

public class Ex11_Lecture {

    public int solution(int n, int[][] arr) {
        int answer=0, max = Integer.MIN_VALUE;
        for(int i =1; i<=n; i++) {
            int cnt = 0;
            for(int j=1; j<= n;j++) {
                for(int k=1; k<=5; k++) {
                    if(arr[i][k] == arr[j][k]) {
                        cnt++;
                        break;
                    }
                }
                if(cnt>max) {
                    max = cnt;
                    answer =i;
                }
            }
        }
        return answer;
    }
    public static void main(String[] args) {
        Ex11_Lecture T = new Ex11_Lecture();
        Scanner kb = new Scanner(System.in);
        int n= kb.nextInt();
        int[][] arr = new int[n+1][6];
        for(int i =1; i<= n; i++) {
            for(int j=1; j<= 5; j++){
                arr[i][j] = kb.nextInt();
            }
        }
        System.out.print(T.solution(n, arr));
    }
}
