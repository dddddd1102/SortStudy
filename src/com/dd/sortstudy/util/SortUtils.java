package com.dd.sortstudy.util;

/**
 * 排序辅助工具类
 * user: daidong
 * date: 2018/2/11.
 */
public class SortUtils {

    public static void swap(int[] arr, int i, int minIndex) {
        int temp = arr[i];
        arr[i] = arr[minIndex];
        arr[minIndex] = temp;
    }
}
