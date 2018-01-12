package me.codebase.leetcode.algo;

import java.util.Arrays;

/**
 * Created by chendong on 2018/1/11.
 */
public class QuickSort {

    private static final int[] arr = {0, 2, 4, 6, 8, 5, 3, 7, 9, 1, 400};

    public static void main(String[] args) {
        System.out.println(Arrays.toString(new QuickSort().sort(arr)));
    }

    public int[] sort(int[] arr) {
        sort(0, arr.length - 1, arr);
        return arr;
    }

    public void sort(int left, int right, int[] arr) {
        if (right > left) {
            int mid = partition(left, right, arr);
            sort(left, mid - 1, arr);
            sort(mid + 1, right, arr);
        }
    }

    private int partition(int left, int right, int[] arr) {
        int mid = (left + right) / 2;
        swap(mid, right, arr);
        int index = left;
        for (int i = left; i < right; i++) {
            if (arr[i] < arr[right]) {
                swap(i, index, arr);
                index++;
            }
        }
        swap(index, right, arr);
        return index;
    }

    private void swap(int i, int j, int[] arr) {
        int temp = arr[i];
        arr[i] = arr[j];
        arr[j] = temp;
    }
}
