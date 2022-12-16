package com.zyk.week1_3;

import java.util.IdentityHashMap;
import java.util.Map;

/**
 * 给定一个整数数组 nums 和一个整数目标值 target，请你在该数组中找出 和为目标值 target  的那 两个 整数，并返回它们的数组下标。
 *
 * 你可以假设每种输入只会对应一个答案。但是，数组中同一个元素在答案里不能重复出现。
 *
 * 你可以按任意顺序返回答案。
 */
public class LeetCode1 {

//    public int[] twoSum(int[] nums, int target) {
//        int[] a = new int[2];
//        for(int i = 0;i < nums.length;i++){
//            for(int j = i + 1;j < nums.length;j++){
//                if(nums[i] + nums[j] == target){
//                    a[0] = i;
//                    a[1] = j;
//                }
//            }
//        }
//        return a;
//    }

    public int[] twoSum(int[] nums, int target) {
        Map<Integer,Integer> a = new IdentityHashMap<>();
        for(int i = 0;i < nums.length;i++){
            if(a.containsKey(target - nums[i])){
                return new int[]{a.get(target - nums[i]),i};
            }
            a.put(nums[i],i);
        }
        return new int[0];
    }

}
