package com.study.search;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.util.ArrayList;
import java.util.List;
import java.util.StringTokenizer;

/**
* 문제 25. 친구 관계 파악하기
 *
* */
public class Book25 {
    private static boolean[] isVisited;
    private static List<List<Integer>> list = new ArrayList<>();
    private static boolean result = false;

    public static void main(String[] args) throws IOException  {
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        StringTokenizer st = new StringTokenizer(br.readLine());
        int node = Integer.parseInt(st.nextToken());
        int edge = Integer.parseInt(st.nextToken());

        isVisited = new boolean[node];

        for(int i = 0; i < edge; i++) {
            List<Integer> subList = new ArrayList<>();
            list.add(subList);
        }

        for(int i = 0 ; i < list.size(); i++) {
            st = new StringTokenizer(br.readLine());
            int a = Integer.parseInt(st.nextToken());
            int b = Integer.parseInt(st.nextToken());

            list.get(a).add(b);
            list.get(b).add(a);
        }

        for(int i = 0 ; i < list.size(); i++) {
            if(!isVisited[i]) {
                dfs(i, 0);
                if(result) {
                    break;
                }
            }
        }

        if(result) {
            System.out.printf("%d", 1);
        } else {
            System.out.printf("%d", 0);
        }
    }

    private static void dfs(int number, int depth) {
        if(result || depth == 4) {
            result = true;
            return;
        }

        isVisited[number] = true;

        for(int i = 0 ; i < list.get(number).size(); i++) {
            int idx = list.get(number).get(i);
            if(!isVisited[idx]) {
                dfs(idx, depth+1);
            }
        }

        isVisited[number] = false;
    }
}
