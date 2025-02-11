package com.study.section03;
import java.util.*;

public class Ex05 {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int n = Integer.parseInt(sc.nextLine());

        int eIdx = (n/2)+1;
        int sIdx = eIdx - 1;
        int total = 0;
        int count = 0;
        int diff = 0;

        while(sIdx > 0) {
            total = 0;
            diff = eIdx - sIdx;
            for(int i=sIdx; i<=eIdx; i++) {
                total += i;
            }

            if(total == n) {
                count++;
                sIdx--;
                eIdx--;
            } else {
                    if(n > total) {
                        sIdx--;
                    } else {
                        eIdx--;
                        if(diff == 1) sIdx--;
                    }
            }
        }

        System.out.printf("%d", count);
    }
}
