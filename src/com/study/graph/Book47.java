package com.study.graph;

import java.io.*;
import java.util.*;

public class Book47 {
    private static List<List<Integer>> list = new ArrayList<>();
    private static boolean[] isVisited ;
    private static int[] sumArray;
    private static Queue<Integer> queue = new LinkedList<>();

    public static void main(String[] args) throws IOException {
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        StringTokenizer st = new StringTokenizer(br.readLine());

        int node = Integer.parseInt(st.nextToken());
        int edge = Integer.parseInt(st.nextToken());

        sumArray = new int[node+1];

        for(int i = 0; i<=node; i++) {
            list.add(new ArrayList<>());
        }

        for(int i = 0 ; i < edge; i++) {
            st = new StringTokenizer(br.readLine());
            int a = Integer.parseInt(st.nextToken());
            int b = Integer.parseInt(st.nextToken());
            list.get(a).add(b);
        }

        for(int i = 1; i <= node; i++) {
            isVisited = new boolean[node+1];
            bfs(i);
        }
        int max = Arrays.stream(sumArray).max().getAsInt();

        for(int i = 1; i<=node; i++) {
            if(sumArray[i]==max) {
                System.out.println(i);
            }
        }


    }

    private static void bfs(int num) {
        queue.add(num);
        isVisited[num] = true;

        while(!queue.isEmpty()) {
            int index = queue.poll();
            List<Integer> target = list.get(index);
            for(int t : target) {
                if(!isVisited[t]) {
                    isVisited[t] = true;
                    queue.add(t);
                    sumArray[t]++;
                }
            }
        }

    }
}
