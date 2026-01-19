package com.study.graph;

import java.util.*;
import java.io.*;
/**
 * 특정 거리의 도시 찾기
 * */
public class Book46 {
    private static List<List<Integer>> list = new ArrayList<>();
    private static Queue<Integer> queue = new LinkedList<>();
    private static boolean[] isVisited ;

    public static void main(String[] args) throws IOException {
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        StringTokenizer st = new StringTokenizer(br.readLine());

        int cityCount = Integer.parseInt(st.nextToken());
        int streetCount = Integer.parseInt(st.nextToken());
        int distance = Integer.parseInt(st.nextToken());
        int startCityNo = Integer.parseInt(st.nextToken());

        isVisited = new boolean[cityCount+1];

        for(int i = 0 ; i <= cityCount; i++) {
            List<Integer> subList = new ArrayList<>();
            list.add(subList);
        }


        for(int i = 1; i <= streetCount; i++) {
            st = new StringTokenizer(br.readLine());
            int a = Integer.parseInt(st.nextToken());
            int b = Integer.parseInt(st.nextToken());

            list.get(a).add(b);
        }

        bfs(distance, startCityNo);
    }

    private static void bfs(int distance, int startCityNo) {
        int depth = 1;

        queue.add(startCityNo);
        isVisited[startCityNo] = true;

        while(!queue.isEmpty() && depth <= distance) {
            int target = queue.poll();

            List<Integer> getList = list.get(target);

            for(int i = 0; i < getList.size(); i++) {
                if(!isVisited[getList.get(i)]) {
                    queue.add(getList.get(i));
                    isVisited[getList.get(i)] = true;
                    if(distance == depth) {
                        System.out.println(getList.get(i));
                    }
                }
            }
            depth++;
        }
    }
}
