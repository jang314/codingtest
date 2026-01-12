package com.study.search;

import java.io.*;
import java.util.*;


public class Book28 {
    private static boolean[] isVisited;
    private static List<List<Edge>> list = new ArrayList<>();
    private static Queue<Edge> queue = new LinkedList<>();
    private static int[] distance;

    public static void main(String[] args) throws IOException {
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        StringTokenizer st = new StringTokenizer(br.readLine());

        int N = Integer.parseInt(st.nextToken());


        for(int i = 0 ; i <= N; i++) {
            list.add(new ArrayList<>());
        }

        for(int i = 0; i <N; i++) {
            int index = 0;
            st = new StringTokenizer(br.readLine());
            List<Edge> subList = new ArrayList<>();
            while(true) {
                int inNum = Integer.parseInt(st.nextToken());
                if(inNum ==-1) break;

                if(index == 0) {
                    index = inNum;
                } else {
                    Edge edge =new Edge(inNum, Integer.parseInt(st.nextToken()));
                    subList.add(edge);
                }
            }
            list.set(index, subList);
        }

        distance = new int[N+1];
        isVisited = new boolean[N+1];


        bfs(1);

        int max = Arrays.stream(distance).max().getAsInt();
        int maxIdx = 0;

        for(int i = 1; i < distance.length; i++) {
            if(distance[i] == max) {
                maxIdx = i;
                break;
            }
        }

        distance = new int[N+1];
        isVisited = new boolean[N+1];

        bfs(maxIdx);

        int tmpMax = Arrays.stream(distance).max().getAsInt();
        if(max < tmpMax) {
            max = tmpMax;
        }

        System.out.printf("%d \n", max);
    }

    private static void bfs(int n) {
        Queue<Integer> queue = new LinkedList<>();

        isVisited[n] = true;
        queue.add(n);

        while(!queue.isEmpty()) {
            int idx = queue.poll();
            for (Edge edge : list.get(idx)) {
                if(!isVisited[edge.node]) {
                    isVisited[edge.node] = true;
                    queue.add(edge.node);
                    distance[edge.node] = distance[idx] + edge.length;
                }
            }
        }

    }

    private static class Edge {
        private int node;
        private int length;

        Edge(int node, int length) {
            this.node = node;
            this.length = length;
        }
    }
}
