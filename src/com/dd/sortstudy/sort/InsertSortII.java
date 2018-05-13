package com.dd.sortstudy.sort;

/**
 * user: daidong
 * date: 2018/5/13.
 * <p>
 * 插入排序的重要特性： 可以提前终止循环。
 * 插入排序改进方法，通过赋值找出合适的位置。
 */
public class InsertSortII {

    public static void sort(int[] arr, int length) {
        for (int i = 0; i < length; i++) {
            // 寻找元素arr[i]合适的插入位置
            int e = arr[i];
            // j保存元素e应该插入的位置
            int j;
            for (j = i; j > 0 && arr[j - 1] > e; j--) {
                arr[j] = arr[j - 1];
            }
            arr[j] = e;
        }
    }
}
