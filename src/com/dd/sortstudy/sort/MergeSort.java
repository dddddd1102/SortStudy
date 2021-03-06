package com.dd.sortstudy.sort;

/**
 * user: daidong
 * date: 2018/5/14.
 * 归并排序： O（N logN）
 */
public class MergeSort {

    public static void sort(int[] arr, int length) {
        long start = System.currentTimeMillis();
        sort(arr, 0, length - 1);
        long end = System.currentTimeMillis();
        float time = (end - start) / 1000.f;
        System.out.println("MergeSort: " + time + "s");
    }

    /**
     * 递归使用归并排序，对arr[l...r]的范围进行排序
     */
    static void sort(int[] arr, int l, int r) {
        // if (l >= r) {
        //     return;
        // }
        // 当数据较小时，可以使用插入排序优化，因为插入排序对于近乎有序的数组效果更好
        if(r - l >15 ) {
            InsertSortII.sort(arr, arr.length);
            return;
        }

        // 有风险，当l与r都足够大时，会引起溢出
        int mid = (l + r) / 2;
        sort(arr, l, mid);
        sort(arr, mid + 1, r);
        merge(arr, l, mid, r);
    }


    /**
     * 将arr[l...mid]和arr[mid+1...r]两部分进行归并
     */
    static void merge(int[] arr, int l, int mid, int r) {
        int aux[] = new int[r - l + 1];
        System.arraycopy(arr, l, aux, 0, r + 1 - l);

        int i = l;
        int j = mid + 1;
        for (int k = l; k <= r; k++) {
            if (i > mid) {
                arr[k] = aux[j - l];
                j++;
            } else if (j > r) {
                arr[k] = aux[i - l];
                i++;
            } else if (aux[i - l] < aux[j - l]) {
                arr[k] = aux[i - l];
                i++;
            } else {
                arr[k] = aux[j - l];
                j++;
            }
        }
    }
}
