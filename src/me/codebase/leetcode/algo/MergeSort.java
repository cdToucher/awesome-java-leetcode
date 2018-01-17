package me.codebase.leetcode.algo;

import java.util.Arrays;

/**
 * Created by chendong on 2018/1/12.
 */
public class MergeSort implements Sort {


    public static void main(String[] args) {
//        sort(arr);
        System.out.println(Arrays.toString(new MergeSort().sort(arr)));
    }

/*    public int[] sort(int[] a){
        int[] h = a.clone();
        return a;
    }*/



    public int[] sort(int[] a) {
        int[] helper = a.clone();
        sort(a, 0, a.length - 1, helper);
        return arr;
    }

    private static void sort(int[] a, int lo, int hi, int[] helper) {
        if (lo >= hi) return;
        int mid = (lo + hi) / 2;
        sort(a, lo, mid, helper);
        sort(a, mid + 1, hi, helper);
        merge(a, lo, mid, hi, helper);
    }

    private static void merge(int[] a, int lo, int mid, int hi, int[] helper) {

        System.arraycopy(a, lo, helper, lo, hi + 1 - lo);
        int i = lo;
        int j = mid + 1;
        for (int k = lo; k <= hi; k++) {
            if (i > mid)
                a[k] = helper[j++];
            else if (j > hi)
                a[k] = helper[i++];
            else if (helper[i] <= helper[j])
                a[k] = helper[i++];
            else
                a[k] = helper[j++];
        }

    }
}
