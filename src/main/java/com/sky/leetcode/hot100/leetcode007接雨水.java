package com.sky.leetcode.hot100;

/**
 * 42. 接雨水
 */
public class leetcode007接雨水 {


    public static int trap(int[] height) {
        /**
         * 木桶原理，能接的雨水由最短的一边板子决定
         */
        int left = 0, right = height.length - 1, result = 0;
        int leftMax = height[left], rightMax = height[right];
        left++;right--;
        while (left <= right) {
            leftMax = Math.max(leftMax, height[left]);
            rightMax = Math.max(rightMax, height[right]);
            if (leftMax < rightMax) {
                result += leftMax - height[left];
                left++;
            } else {
                result += rightMax - height[right];
                right--;
            }
        }
        return result;
    }

    public static void main(String[] args) {
        int[] height = {5,4,1,2};
        System.out.println(trap(height));
    }

}
