package me.codebase.leetcode;

import java.util.HashMap;
import java.util.Map;

/**
 * Created by chendong on 2017/12/13.
 */
public class Test {


    public static void main(String[] args) {
        Integer[] arr1 = {1, 2, 3};
        Integer[] arr2 = {2, 3, 4};

        int mid1 = arr1.length / 2;
        int mid2 = arr2.length / 2;
    }

    /*   public static int lengthOfLongestSubstring(String s) {
           int len;
           if (s == null || (len = s.length()) == 0) return 0;
           int preP = 0, max = 0;
           int[] hash = new int[128];
           for (int i = 0; i < len; ++i) {
               char c = s.charAt(i);
               if (hash[c] > preP) {
                   preP = hash[c];
               }
               int l = i - preP + 1;
               hash[c] = i + 1;
               if (l > max) max = l;
           }
           return max;
       }
   */
    private static String distinct(String str) {
        Map<Character, Integer> map = new HashMap<>();
        char[] chars = str.toCharArray();
        for (int i = 0; i < chars.length; i++) {

            if (map.get(chars[i]) != null)
                map.put(chars[i], i - map.get(chars[i]));
            else
                map.put(chars[i], i);
        }
        return null;
    }




/*
    private static String findSubString(String str, int index) {
        char[] chars = str.toCharArray();
        int l = 1;
        for (int i = index; i < chars.length; i++) {
            if (chars[i] != chars[i++]) {
                l++;
            }else break;
        }
        return String.valueOf()
    }
*/


}
