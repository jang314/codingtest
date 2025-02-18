package com.study.section06;

import java.util.Scanner;

public class Ex04 {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int resultSize = sc.nextInt();
        int processSize = sc.nextInt();

        sc.nextLine();

        int[] resultArray = new int[resultSize];
        int[] processArray = new int[processSize];

        for(int i = 0; i < processSize; i++) {
            processArray[i] = sc.nextInt();
        }

        for(int i = 0; i < processArray.length; i++) {
            int target = processArray[i];
            int temp = resultArray[0];
            resultArray[0] = target;
            int j = 0;
            while(temp != 0 && target != temp && j < resultSize-1) {
                int num = temp;
                temp = resultArray[j+1];
                resultArray[j+1] = num;
                j++;
            }
        }
        for (int arr : resultArray) {
            System.out.printf("%d ", arr);
        }
    }
}

