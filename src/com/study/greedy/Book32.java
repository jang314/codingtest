package com.study.greedy;

import java.util.Arrays;
import java.util.Comparator;
import java.util.Scanner;

public class Book32 {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int count = sc.nextInt();
        int target = sc.nextInt();
        sc.nextLine();

        int[] arrays = new int[count];

        for(int i = 0 ; i < arrays.length; i++) {
            arrays[i] = Integer.parseInt(sc.nextLine());
        }

        int[] sortedArray = Arrays.stream(arrays)
                .boxed().
                sorted(Comparator.reverseOrder())
                .mapToInt(Integer::intValue).toArray();

        int rest = target;
        int answer = 0;
        for(int i = 0 ; i < sortedArray.length; i++) {
            while(sortedArray[i] <= rest) {
                rest -= sortedArray[i];
                answer++;
            }
        }

        System.out.printf("%d", answer);
    }
}
