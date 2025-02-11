package com.study.section04;

import java.util.*;
import java.util.stream.Collectors;
import java.util.stream.IntStream;

public class Ex05 {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int n = sc.nextInt();
        int k = sc.nextInt();
        sc.nextLine();

        int[] arrays = new int[n];
        TreeSet<Integer> treeSet = new TreeSet<>(Collections.reverseOrder());

        for(int i = 0 ; i < n; i++) {
            arrays[i] = sc.nextInt();
        }

        Arrays.sort(arrays);
        for(int eIdx = arrays.length-1; eIdx>=0; eIdx--)
        {
            for(int cIdx = eIdx-1; cIdx >0; cIdx--) {
                for(int sIdx = cIdx-1; sIdx>=0; sIdx--) {
                    treeSet.add(arrays[sIdx] + arrays[cIdx] + arrays[eIdx]);
                }
            }
        }

        int cnt = 1;
        for(Integer answer : treeSet) {
            if(cnt == k) {
                System.out.printf("%d", answer);
                break;
            }
            cnt++;
        }

        if(cnt != k) {
            System.out.println(-1);
        }
    }
}
