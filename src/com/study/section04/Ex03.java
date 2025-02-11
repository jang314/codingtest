package com.study.section04;
import java.util.*;

public class Ex03 {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int n = sc.nextInt();
        int k = sc.nextInt();

        int[] arrays = new int[n];
        int[] answer = new int[n-k+1];
        sc.nextLine();

        for(int i = 0; i < n; i++) {
            arrays[i]=sc.nextInt();
        }

        int sIdx = 0;
        Map<Integer, Integer> map = new HashMap<>();

        for(int i = 0 ; i < arrays.length; i++) {
            if(i>=k) {
                if(map.getOrDefault(arrays[sIdx], 0) <= 1) {
                    map.remove(arrays[sIdx]);
                } else {
                    map.put(arrays[sIdx], map.get(arrays[sIdx]) - 1);
                }
                sIdx++;
            }
            int getCount = map.getOrDefault(arrays[i], 0);

            map.put(arrays[i], getCount + 1);
            answer[sIdx] = map.size();
        }

        for(int i : answer) {
            System.out.printf("%d ", i);
        }
    }
}
