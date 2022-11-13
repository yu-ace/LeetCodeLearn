package com.zyk.week2;


/**
 * 给定一个排序数组和一个目标值，在数组中找到目标值，并返回其索引。如果目标值不存在于数组中，返回它将会被按顺序插入的位置。
 *
 * 请必须使用时间复杂度为 O(log n) 的算法。
 */
public class LeetCode35 {

    //时间复杂度不符合题意
//    public int searchInsert(int[] nums, int target) {
//        int a = 0;
//        if(nums[nums.length - 1] < target){
//            a = nums.length;
//        }
//        for(int i =0;i < nums.length;i++){
//            if(nums[i] < target){
//                a = i + 1;
//            }
//        }
//        return a;
//    }


    public int searchInsert(int[] nums, int target) {
        int n = nums.length;
        int left = 0;
        int right = n - 1;
        while(left <= right){
            int mid = ((right - left) >>1) + left;
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