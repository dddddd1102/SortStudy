package com.dd.sortstudy.sort;

import com.dd.sortstudy.util.SortUtils;

/**
 * 选择排序
 * user: daidong
 * date: 2018/2/11.
 */
public class SelectionSort {

    public static void sort(int arr[], int n) {
        long start = System.currentTimeMillis();
        for (int i = 0; i < n; i++) {
            // 寻找 [i, n) 区间最小值
            int minIndex = i;
            for (int j = i + 1; j < n; j++) {
                if (arr[j] < arr[minIndex]) {
                    minIndex = j;
                }
            }
            SortUtils.swap(arr, i, minIndex);
        }
        long end = System.currentTimeMillis();
        float time = (end - start) / 1000.f;
        System.out.println("SelectSort: " + time + "s");
    }
}
