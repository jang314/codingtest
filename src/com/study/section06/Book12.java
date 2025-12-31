package com.study.section06;

import java.util.Scanner;
import java.util.Stack;

public class Book12 {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int N = sc.nextInt();
        sc.nextLine();

        int[] array = new int[N+1];
        for(int i = 1; i <= N; i++) {
            array[i] = sc.nextInt();
        }

        int[] result = new int[N+1];
        int i = 1;
        while (i <= N) {
            Stack<Integer> stack = new Stack<>();
            int j=i;
            int target = array[i];
            while(j<=N) {
                if(stack.isEmpty() || stack.peek() < target) {
                    if(j == N) {
                        result[i] = -1;
                        break;
                    }
                    stack.push(array[j+1]);
                    j++;
                } else if (stack.peek() > target) {
                    Integer pop = stack.pop();
                    result[i] = pop;
                    break;
                }
            }

            i++;
        }

        for (int rst : result) {
            System.out.printf("%d ", rst);
        }
    }
}
