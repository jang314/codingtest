package com.study.section02;

import java.util.*;
import java.util.concurrent.atomic.AtomicInteger;
import java.util.stream.Collectors;

public class Ex08 {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        String n = sc.nextLine();
        String input = sc.nextLine();
        Integer[] array = Arrays.stream(input.split(" "))
                .mapToInt(Integer::parseInt).boxed().toArray(Integer[]::new);

        Arrays.sort(array, Comparator.reverseOrder());

        int idx = 0;
        for(String str : input.split(" ")) {
            int num = Integer.parseInt(str);
            for(int i = 0; i < array.length; i++) {
                if(array[i] == num) {
                    System.out.printf("%d ", i+1);
                    break;
                }
            }
        }
    }
}
