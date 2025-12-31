package com.study.search;

import java.util.*;
import java.io.*;
import java.util.stream.Collectors;

public class Book26 {
    private static List<List<Integer>> list = new ArrayList<>();
    private static Queue<Integer> que = new LinkedList<>();

    private static boolean[] isVisited ;

    private static int dIdx = 0;
    private static int bIdx = 0;

    private static int[] dArray ;
    private static int[] bArray ;

    public static void main(String[] args) throws IOException {
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        StringTokenizer st = new StringTokenizer(br.readLine());
        int node = Integer.parseInt(st.nextToken());
        int edge = Integer.parseInt(st.nextToken());
        int sIdx = Integer.parseInt(st.nextToken());

        isVisited = new boolean[node+1];

        dArray = new int[node];
        bArray = new int[node];

        for(int i = 0; i <=node; i++) {
            list.add(new ArrayList<>());
        }

        for(int i = 1; i <= edge; i++) {
            st = new StringTokenizer(br.readLine());
            int a = Integer.parseInt(st.nextToken());
            int b = Integer.parseInt(st.nextToken());

            list.get(a).add(b);
            list.get(b).add(a);
        }

        // 오름차순 정렬
        for(int i = 1; i <= edge; i++) {
            List<Integer> subList = list.get(i);
            List<Integer> sorted = subList.stream().sorted().collect(Collectors.toList());
            list.set(i, sorted);
        }
        dfs(sIdx);
        isVisited = new boolean[node+1];
        bfs(sIdx);

        for(int i = 0; i<dArray.length; i++) {
            System.out.printf("%d ", dArray[i]);
        }

        System.out.println();
        for(int j = 0 ; j < bArray.length; j++) {
            System.out.printf("%d ", bArray[j]);
        }
    }

    private static void dfs(int number) {
        if(isVisited[number]) {
            return;
        }
        isVisited[number] = true;
        dArray[dIdx] = number;
        dIdx++;

        for(int i = 0; i < list.get(number).size(); i++) {
            int target = list.get(number).get(i);
            if(!isVisited[target]) {
                dfs(target);
            }
        }
    }

   private static void bfs(int number) {
        if(!isVisited[number]) {
            que.add(number);
            isVisited[number] = true;
        }

       bArray[bIdx++] = number;

        while(!que.isEmpty()) {
            int target = que.poll();

            for(int i = 0; i < list.get(target).size(); i++) {
                if(!isVisited[list.get(target).get(i)]) {
                    que.add(list.get(target).get(i));
                    isVisited[list.get(target).get(i)] = true;
                    bArray[bIdx++] = list.get(target).get(i);
                }
            }
        }
   }
}
