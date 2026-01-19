package com.study.graph;

import java.io.*;
import java.util.*;

public class Book48 {
    private static List<List<Integer>> list ;
    private static String[] answers;
    private static int[] isVisited;
    private static Queue<Integer> queue;

    public static void main(String[] args) throws IOException {
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        StringTokenizer st = new StringTokenizer(br.readLine());

        int testCase = Integer.parseInt(st.nextToken());
        answers = new String[testCase];

        for(int i = 0 ; i<testCase; i++) {
            st = new StringTokenizer(br.readLine());

            int node = Integer.parseInt(st.nextToken());
            int edge = Integer.parseInt(st.nextToken());

            isVisited = new int[node+1];
            list = new ArrayList<>();
            queue = new LinkedList<>();

            for(int j = 0 ; j<=node; j++) {
                list.add(new ArrayList<>());
            }

            for(int j = 0; j < edge; j++) {
                st = new StringTokenizer(br.readLine());
                int a = Integer.parseInt(st.nextToken());
                int b = Integer.parseInt(st.nextToken());
                list.get(a).add(b);
                list.get(b).add(a);
            }

            for(int j = 1; j <= node; j++) {
                if(answers[i].equals("NO")) break;
                if(isVisited[j] == 0) {
                    bfs(j, i);
                }
            }
            if(answers[i] == null) {
                answers[i] = "YES";
            }
        }

        for(String answer : answers) {
            System.out.println(answer);
        }
    }

    private static void bfs(int number, int i) {
        queue.add(number);
        isVisited[number] = 1;

        while(!queue.isEmpty()) {
            int index = queue.poll();
            List<Integer> arrays = list.get(index);

            for(int arr : arrays) {
                if(isVisited[arr] == 0) {
                    isVisited[arr] = (isVisited[index] == 1) ? 2 : 1;
                    queue.add(arr);
                } else if(isVisited[arr] == isVisited[index]) {
                    answers[i] = "NO";
                    return;
                }
            }
        }

    }
}
