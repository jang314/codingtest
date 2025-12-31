package com.study.section06;

import java.util.*;

public class Ex07_lecture {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int size = sc.nextInt();

        List<Point> list = new ArrayList<>();
        for(int i = 0 ; i < size; i++) {
            int x = sc.nextInt();
            int y = sc.nextInt();
            list.add(new Point(x, y));
        }

        Collections.sort(list);
        list.forEach(l -> System.out.printf("%d %d \n", l.x, l.y));

    }

    public static class Point implements Comparable<Point> {
        int x = 0 ;
        int y = 0 ;

        public Point(int x, int y) {
            this.x = x;
            this.y = y;
        }

        @Override
        public int compareTo(Point point) {
            if(this.x == point.x) {
                return this.y - point.y;
            } else {
                return this.x - point.x;
            }
        }

    }

}
