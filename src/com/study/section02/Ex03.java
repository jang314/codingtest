package com.study.section02;

import java.util.Comparator;
import java.util.Scanner;

public class Ex03 {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int tryCount = Integer.parseInt(sc.nextLine());
        String inputA = sc.nextLine();
        String inputB = sc.nextLine();

        String[] arrayA = inputA.split(" ");
        String[] arrayB = inputB.split(" ");
        Comparator<Integer> comp = (o1, o2) -> {
            if(o1 == o2) {
                return 68;
            } else {
                switch (o1) {
                    case 1: return o2 == 3 ? 65 : 66;
                    case 2: return o2 == 1 ? 65 : 66;
                    case 3: return o2 == 2 ? 65 : 66;
                }
            }
            return 0;
        };

        for(int i = 0 ; i < tryCount; i++) {
            int a = Integer.parseInt(arrayA[i]);
            int b = Integer.parseInt(arrayB[i]);

            System.out.println((char) comp.compare(a, b));
        }
    }
}
