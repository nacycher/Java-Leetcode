package com.sky.leetcode.hot100;

import java.util.HashMap;
import java.util.HashSet;

/**
 * 128. 最长连续序列
 */
public class leetcode03最长连续序列 {

    public static int longestConsecutive(int[] nums) {
        HashSet<Integer> num_set = new HashSet<>();
        for (int num : nums) {
            num_set.add(num);
        }
        int longestStreak = 0;

        for (int num : num_set) {
            if (!num_set.contains(num - 1)) {
                int currentNum = num;
                int currentStreak = 1;

                while (num_set.contains(currentNum + 1)) {
                    currentNum += 1;
                    currentStreak += 1;
                }

                longestStreak = Math.max(longestStreak, currentStreak);
            }
        }
        return longestStreak;
    }

    private void findInHashSet(int num, HashSet<Integer> hashSet) {

    }


    public static void main(String[] args) {
        int[] nums = {100, 4, 200, 1, 3, 2};
        int i = longestConsecutive(nums);
        System.out.println(i);
    }
}
