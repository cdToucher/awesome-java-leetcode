package me.codebase.leetcode;

import java.util.ArrayList;
import java.util.List;

/**
 * Created by chendong on 2018/1/5.
 */
public class _554 {

    /*
    input:
    [[1,2,2,1],
 [3,1,2],
 [1,3,2],
 [2,4],
 [3,1,2],
 [1,3,1,1]]
    output:
    2
     */

    public static void main(String[] args) {
        List<Integer[]> input = new ArrayList<>();
        input.add(new Integer[]{1, 2, 2, 1});
        input.add(new Integer[]{3, 1, 2});
        input.add(new Integer[]{1, 3, 2});
        input.add(new Integer[]{2, 4});
        input.add(new Integer[]{3, 1, 2});
        input.add(new Integer[]{1, 3, 1, 1});
        System.out.println(solution(input));
    }

    private static int solution(List<Integer[]> input) {
        int result = -1;
        List<List<Integer>> points = new ArrayList<>(input.size());
        for (Integer[] breaks : input) {
            List<Integer> list = new ArrayList<>();
            int point = 0;
            for (Integer integer : breaks) {
                point += integer;
                list.add(point);
            }
            points.add(list);
        }
        List<Integer> last = points.get(points.size() - 1);
        for (int i = 0; i < last.size() - 1; i++) {
            int temp = 0;
            for (List<Integer> breaks : points) {
                if (!breaks.contains(last.get(i)))
                    temp++;
            }
            if (result == -1)
                result = temp;
            result = temp > result ? result : temp;
        }
        return result;
    }
}
