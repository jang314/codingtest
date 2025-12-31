package com.study.sort;
import java.util.*;
import java.io.*;

public class Book19 {
    private static int K;
    public static void main(String[] args) throws IOException {
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        StringTokenizer st = new StringTokenizer(br.readLine());

        int N = Integer.parseInt(st.nextToken());

        K = Integer.parseInt(st.nextToken()) - 1;

        st = new StringTokenizer(br.readLine());

        int[] arrays = new int[N];
        for(int i =0; i < N; i++) {
            arrays[i] = Integer.parseInt(st.nextToken());
        }

        quickSort(0, N-1, arrays);
        System.out.printf("%d ", arrays[K]);
    }

    private static void quickSort(int start, int end, int[] arrays) {
        if(start > end) {
            return;
        }

        int pivot = partition(start, end, arrays);

        quickSort(start, pivot-1, arrays);
        quickSort(pivot+1, end, arrays);
    }

    private static int partition(int start, int end, int[] arrays) {
        int pivot = start;
        int low = pivot+1;
        int high = end;

        while(low < high) {
            while((arrays[low] < arrays[pivot])) {
                low++;
            }

            while((arrays[high] > arrays[pivot]) ) {
                high--;
            }
            if(low < high) {
                swap(arrays, low, high);
            }
        }
        if(arrays[pivot] > arrays[high]) {
            swap(arrays, pivot, high);
        }
        return high;
    }

    private static void swap(int[] arrays, int to, int from) {
        int temp = arrays[to];
        arrays[to] = arrays[from];
        arrays[from] = temp;
    }

}
