package com.dd.sortstudy;

import com.dd.sortstudy.sort.InsertionSort;
import com.dd.sortstudy.sort.SelectionSort;

/**
 * user: daidong
 * date: 2018/2/11.
 */
public class Main {

    public static void main(String[] args) {
        int a[] = new int[]{10, 9, 8, 7, 6, 5, 4, 3, 2, 1};
//        SelectionSort.sort(a, 10);
        InsertionSort.sort(a, 10);
        for (int i : a) {
            System.out.print(i + " ");
        }
        System.out.println();
    }


}
