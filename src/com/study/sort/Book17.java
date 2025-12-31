package com.study.sort;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;

public class Book17 {
    public static void main(String[] args) throws IOException {
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));

        String s = br.readLine();
        char array[] = s.toCharArray();

        for(int i = 0 ; i < s.length(); i++) {
            int max = i;
            for(int j = i+1; j < s.length(); j++) {
                if(array[max] < array[j]) {
                    max = j;
                }
            }
            char temp = array[i];
            array[i] = array[max];
            array[max] = temp;
        }

        for(int i = 0; i<array.length; i++) {
            System.out.printf("%c",array[i]);
        }
    }
}
