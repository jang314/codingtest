package com.study.sort;

import java.util.*;

public class Book16 {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int N = Integer.parseInt(sc.nextLine());
        int array[] =new int[N];
        List<Data> list = new ArrayList<>();

        for(int i = 0 ; i < N; i++) {
            array[i]= Integer.parseInt(sc.nextLine());
            list.add(new Data(i, array[i]));
        }

        Collections.sort(list);

        int max = 0;
        for(int i = 0; i < list.size(); i++) {
            Data data = list.get(i);
//            System.out.println(data.idx + ", " + data.value);
            if(max < data.idx - i) {
                max = data.idx-i;
            }
        }

        System.out.println(max+1);
    }

    private static class Data implements Comparable<Data>  {
        private int idx;
        private int value;

        public Data(int idx, int value) {
            this.idx = idx;
            this.value = value;
        }

        @Override
        public int compareTo(Data o) {
            return this.value - o.value;
        }
    }

}
