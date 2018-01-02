package me.codebase.leetcode;

/**
 * Created by chendong on 2017/12/13.
 */
public class Test {


    public static void main(String[] args) {
        int[] A = {1, 3, 4, 6};
        int[] B = {2, 4, 5, 8, 9, 10};
        int[] C = {1, 2, 3, 4, 4, 5, 6, 8, 9, 10};
        // 4.5


        System.out.println(findMedianSortedArrays(A, B));
    }


    /**
     * satisfy the require which is should be O(log(m+n))
     * <p>
     * Array, Binary Search, Divide and Conquer
     */
    private static int findKth(int k, int[] A, int[] B) {

        return 0;
    }

    private static int findKth(int k, int[] arr) {
        return 0;
    }

    public static double findMedianSortedArrays(int[] nums1, int[] nums2) {
        int len = nums1.length + nums2.length;
        if (len % 2 == 0) {
            return (helper(nums1, 0, nums2, 0, len / 2) + helper(nums1, 0, nums2, 0, len / 2 + 1)) / 2.0;
        }
        return helper(nums1, 0, nums2, 0, (len + 1) / 2);
    }

    private static int helper(int[] nums1, int m, int[] nums2, int n, int k) {
        if (m >= nums1.length) return nums2[n + k - 1];
        if (n >= nums2.length) return nums1[m + k - 1];
        if (k == 1) return Math.min(nums1[m], nums2[n]);

        int p1 = m + k / 2 - 1;
        int p2 = n + k / 2 - 1;
        int mid1 = p1 < nums1.length ? nums1[p1] : Integer.MAX_VALUE;
        int mid2 = p2 < nums2.length ? nums2[p2] : Integer.MAX_VALUE;
        if (mid1 < mid2) {
            return helper(nums1, m + k / 2, nums2, n, k - k / 2);
        }
        return helper(nums1, m, nums2, n + k / 2, k - k / 2);
    }

}
