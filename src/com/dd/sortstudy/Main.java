package com.dd.sortstudy;
import com.dd.sortstudy.sort.InsertSortII;
import com.dd.sortstudy.sort.InsertionSort;
import com.dd.sortstudy.sort.MergeSort;
import com.dd.sortstudy.sort.SelectionSort;
import com.dd.sortstudy.util.SortUtils;

/**
 * user: daidong
 * date: 2018/2/11.
 */
public class Main {

    public static void main(String[] args) {
        int[] a = SortUtils.generateRandomArray(100000);
        int[] a1 = a;   
        int[] a2 = a;
        int[] a3 = a;

        SelectionSort.sort(a2, a2.length);

        InsertionSort.sort(a1, a1.length);

        InsertSortII.sort(a3, a3.length);

        MergeSort.sort(a, a.length);

        System.out.println();
    }

}
