package com.dd.sortstudy.sort;

import com.dd.sortstudy.util.SortUtils;

/**
 * user: daidong
 * date: 2018/5/8.
 */
public class InsertionSort {

    public static void sort(int[] arr, int length) {

        for (int i = 1; i < length; i++) {
            for (int j = i; j > 0 && arr[j] < arr[j - 1]; j--) {
                SortUtils.swap(arr, j, j - 1);
            }
        }

    }
}
