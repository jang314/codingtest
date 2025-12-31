package com.study.array;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.util.StringTokenizer;

public class Book09 {
    public static void main(String[] args) throws IOException {
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        StringTokenizer st = new StringTokenizer(br.readLine());

        int N = Integer.parseInt(st.nextToken());
        int M = Integer.parseInt(st.nextToken());

        // 배열 입력 및 저장
        st = new StringTokenizer(br.readLine());
        String str = st.nextToken();
        char[] array = str.toCharArray();

        // 부분 문자열에 포함돼야 할 개수 저장 // ACGT
        st = new StringTokenizer(br.readLine());
        int[] query = new int[4];
        for(int i = 0 ; i < query.length; i++) {
            query[i] = Integer.parseInt(st.nextToken());
        }

        int sIdx = 0;
        int eIdx = M-1;
        int result = 0;
        while(eIdx < N) {
            int[] count = new int[4];

            for(int i = sIdx; i <=eIdx; i++) {
                if(array[i] == 'A') {
                    count[0]++;
                } else if(array[i] == 'C') {
                    count[1]++;
                } else if(array[i] == 'G') {
                    count[2]++;
                } else if(array[i] == 'T') {
                    count[3]++;
                }
            }

            if(query[0] <= count[0] && query[1] <= count[1] && query[2] <= count[2] && query[3] <= count[3]) {
                result++;
            }

            sIdx++;
            eIdx++;
        }

        System.out.println(result);
    }

}
