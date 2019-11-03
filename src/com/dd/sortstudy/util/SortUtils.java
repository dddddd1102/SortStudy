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

    public static int[] generateRandomArray(int count) {
        int[] arr = new int[count];
        for(int i = 0; i < count; i++) {
            arr[i] = (int) (Math.random() * count) + 1;
        }
        return arr;
    }

    public static int[] generateNearlyOrderRandomArray(int count, int swap) {
        int[] arr = new int[count];
        for(int i = 0; i < count; i++) {
            arr[i] = i + 1;
        }
        for(int i = 0; i < swap ; i++) {
            int x = (int) (Math.random() * count);
            int y = (int) (Math.random() * count);
            swap(arr, x, y);
        }

        return arr;
    }

    public static int[] generateRepeatRandomArray(int count, int max) {
        int[] arr = new int[count];
        for(int i = 0; i < count; i++) {
            arr[i] = (int) (Math.random() * max) + 1;
        }
        return arr;
    }
}
