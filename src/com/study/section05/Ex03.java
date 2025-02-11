package com.study.section05;

import java.util.Arrays;
import java.util.Scanner;
import java.util.Stack;

public class Ex03 {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int n = sc.nextInt();
        sc.nextLine();

        int[][] board = new int[n+1][n+1];

        for(int i = 1 ; i <= n; i++) {
            for (int j = 1; j <= n; j++) {
                board[i][j] = sc.nextInt();;
            }
            sc.nextLine();
        }

        int m = sc.nextInt();
        sc.nextLine();
        int[] moves = new int[m+1];

        for(int i = 1; i <= m; i++) {
            moves[i] = sc.nextInt();
        }


        int[] count = new int[n+1];
        Arrays.fill(count, 1);

        Stack<Integer> stack = new Stack<>();

        int answer = 0;
        int idx = 1;

        while(idx < moves.length) {
            int j = moves[idx];
            int i = count[j];
            if(i > n) {
                idx++;
                continue;
            }
            if(i <= n) {
                if(board[i][j] > 0) {
                    if(!stack.isEmpty()) {
                        if(stack.peek() == board[i][j]) {
                            stack.pop();
                            answer++;
                        } else {
                            stack.push(board[i][j]);
                        }
                    } else {
                        stack.push(board[i][j]);
                    }
                    idx++;
                }
            } else {
                idx++;
            }
            count[j]++;
        }

        System.out.println(answer*2);
    }
}
