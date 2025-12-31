package com.study.twopointer;

import java.util.HashMap;
import java.util.Map;
import java.util.Scanner;

public class Ex01 {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int num = sc.nextInt();
        sc.nextLine();
        char[] votes = sc.nextLine().toCharArray();
        Map<Character, Integer> map = new HashMap<>();

        for(int n = 0; n < num; n++) {
            int count = map.getOrDefault(votes[n], 0);
            map.put(votes[n], count+1);
        }

        char answer = map.entrySet().stream().max((o1, o2) -> o1.getValue() - o2.getValue()).get().getKey();
        System.out.printf("%c", answer);
    }
}
