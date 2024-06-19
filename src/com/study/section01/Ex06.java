package com.study.section01;

import java.util.ArrayList;
import java.util.List;
import java.util.Scanner;
import java.util.stream.Collectors;

public class Ex06 {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        String input = sc.nextLine();
        mySolution(input);
    }

    private static void mySolution(String input) {
        List<String> list = new ArrayList<>();

        for(int i = 0 ; i< input.length(); i++) {
            list.add(String.valueOf(input.charAt(i)));
        }

        list.stream().distinct().collect(Collectors.toList())
                .forEach(s -> System.out.print(s));
    }
}
