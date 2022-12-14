package com.zyk.week3_1;

/**
 * 给你两个按 非递减顺序 排列的整数数组 nums1 和 nums2，另有两个整数 m 和 n ，分别表示 nums1 和 nums2 中的元素数目。
 *
 * 请你 合并 nums2 到 nums1 中，使合并后的数组同样按 非递减顺序 排列。
 *
 * 注意：最终，合并后数组不应由函数返回，而是存储在数组 nums1 中。为了应对这种情况，nums1 的初始长度为 m + n，其中前 m 个元素表示应合并的元素，后 n 个元素为 0 ，应忽略。nums2 的长度为 n 。
 */
public class LeetCode88 {

//    public void merge(int[] nums1, int m, int[] nums2, int n){
//        for(int i = m;i < nums1.length;i++){
//            nums1[i] = nums2[i - m];
//        }
//        for(int i = 0;i < nums1.length;i++){
//            for(int j = i + 1;j < nums1.length;j++){
//                if(nums1[i] > nums1[j]){
//                    int tmp = nums1[j];
//                    nums1[j] = nums1[i];
//                    nums1[i] = tmp;
//                 }
//            }
//        }
//    }


    public static void main(String[] args) {
        int[] a = {1,2,3,0,0,0};
        int m = 3;
        int[] b = {2,5,6};
        int n = 3;
        merge(a,m,b,n);
        System.out.println(1);
    }

    //逆双指针
    public static void merge(int[] nums1, int m, int[] nums2, int n) {
        int p1 = m - 1, p2 = n - 1;
        int tail = m + n - 1;
        int cur;
        while (p1 >= 0 || p2 >= 0) {
            if (p1 == -1) {
                cur = nums2[p2--];
            } else if (p2 == -1) {
                cur = nums1[p1--];
            } else if (nums1[p1] > nums2[p2]) {
                //num1[p1--] 等同于 num1[p1];p1--;
                cur = nums1[p1--];
            } else {
                cur = nums2[p2--];
            }
            nums1[tail--] = cur;
        }
    }
}
