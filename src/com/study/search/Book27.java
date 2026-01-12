package com.study.search;

import java.util.*;
import java.io.*;
/**
 * 문제 27. 미로 탐색하기
 * */
public class Book27 {
    private static boolean[][] isVisited;
    private static int[][] validArr = new int[][]{{-1, 0}, {0, 1}, {0, -1}, {1, 0}};
    private static int[][] arrays;
    private static Queue<int[]> queue;
    private static int n;
    private static int m;
    private static int depth;


    public static void main(String[] args)  {
        Scanner sc = new Scanner(System.in);

        n = sc.nextInt();
        m = sc.nextInt();

         arrays = new int[n+1][m+1];
        isVisited = new boolean[n+1][m+1];

        sc.nextLine();

        for(int i = 1; i <= n; i++) {
            String input = sc.nextLine();

            for(int j = 1 ; j <= m; j++) {
                arrays[i][j] = Integer.parseInt(String.valueOf(input.charAt(j-1)));
            }
        }

        bfs(1, 1);
        System.out.println(arrays[n][m]);
    }

    private static void bfs(int x, int y) {
        queue = new LinkedList<>();
        queue.add(new int[]{x, y});
        isVisited[x][y] = true;
        depth = 0;

        while(!queue.isEmpty()) {
                int[] target = queue.poll();
                x = target[0];
                y = target[1];
                isValid(x, y);
            depth++;
        }

    }

    private static void isValid(int targetX, int targetY) {
        for(int j=0; j<validArr.length; j++) {
            int x = targetX + validArr[j][0];
            int y = targetY + validArr[j][1];
            if(( x > 0 && x<=n) && (y > 0 && y <= m)) {
                if(!isVisited[x][y] && arrays[x][y] > 0)  {
                    isVisited[x][y] = true;
                    queue.add(new int[]{x, y});
                    arrays[x][y] = arrays[targetX][targetY] + 1;
                }
            }
        }

    }
}
