package com.study.search;


import java.io.*;
import java.util.*;

public class Book29 {
    public static void main(String[] args) throws IOException {
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        StringTokenizer st = new StringTokenizer(br.readLine());

        int n = Integer.parseInt(st.nextToken());

        st = new StringTokenizer(br.readLine());
        int[] arrays = new int[n];

        for(int i =0; i < n; i++) {
            arrays[i] = Integer.parseInt(st.nextToken());
        }

        st = new StringTokenizer(br.readLine());
        int m = Integer.parseInt(st.nextToken());

        int[] targets = new int[m];

        st = new StringTokenizer(br.readLine());
        for(int i = 0 ; i < m; i++) {
            targets[i] = Integer.parseInt(st.nextToken());
        }

        Arrays.sort(arrays);

        int answer[] = new int[m];
        for(int i = 0 ; i < targets.length; i++) {
            int target = targets[i];
            int sIdx = 0;
            int eIdx = n-1;

            while(sIdx <= eIdx) {
                int mid = (sIdx + eIdx) / 2;

                if(target > arrays[mid]) {
                    sIdx = mid +1 ;
                } else if (target < arrays[mid]){
                    eIdx = mid-1;
                } else {
                    answer[i] = 1;
                    break;
                }
            }
        }

        for (int i = 0 ; i<answer.length; i++) {
            System.out.printf("%d \n", answer[i]);
        }
    }
}
