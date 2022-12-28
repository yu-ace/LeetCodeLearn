package com.zyk.week2_3;

/**
 * 给定一个排序数组和一个目标值，在数组中找到目标值，并返回其索引。如果目标值不存在于数组中，返回它将会被按顺序插入的位置。
 *
 * 请必须使用时间复杂度为 O(log n) 的算法。
 */
public class LeetCode35 {

    public static void main(String[] args) {
        int[] a = {1,3,5,7};
        int t = 5;
        searchInsert(a,t);
        System.out.println(1);
    }
    public static int searchInsert(int[] nums, int target) {
        int n = nums.length;
        int left = 0;
        int right = n - 1;
        while(left < right){
            int mid = ((right - left) / 2) + left;
            if(target <= nums[mid]){
                n = mid;
                right = mid - 1;
            }else{
                left = mid + 1;
            }
        }
        return n;
    }

}
