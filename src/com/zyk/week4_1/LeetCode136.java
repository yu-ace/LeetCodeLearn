package com.zyk.week4_1;

/**
 * 给你一个 非空 整数数组 nums ，除了某个元素只出现一次以外，其余每个元素均出现两次。找出那个只出现了一次的元素。
 *
 * 你必须设计并实现线性时间复杂度的算法来解决此问题，且该算法只使用常量额外空间。
 */
public class LeetCode136 {

    public static void main(String[] args) {
        int[] nums = {4,2,1,1,2};
        System.out.println(singleNumber(nums));
    }
    public static int singleNumber(int[] nums) {
        int single = 0;
        for(int a : nums){
            single^= a;
        }
        return single;
    }
}
