package com.zyk.week3;

/**
 *给定一个由 整数 组成的 非空 数组所表示的非负整数，在该数的基础上加一。
 *
 * 最高位数字存放在数组的首位， 数组中每个元素只存储单个数字。
 *
 * 你可以假设除了整数 0 之外，这个整数不会以零开头。
 *
 * 本题应该从末尾考虑，遍历数组，逢9进1，末尾变0，前一位加1，如果遍历结束都为9，就对数组扩容，将新数组第一个数定为1；
 *
 */
public class LeetCode66 {

    public static void main(String[] args) {
        int[] a = {9,9};
        plusOne(a);
        for(int i =0;i<a.length;i++){
            System.out.println(a[i]);
        }
    }

    public static int[] plusOne(int[] digits) {
        for(int i = digits.length - 1; i >= 0;i--){
            //如果末尾为9，就变为0，再进入循环
            if(digits[i] == 9){
                digits[i] = 0;
                //当数组中没有9以后，当前遍历位置+1，即可输出数组
            }else{
                digits[i]++;
                return digits;
            }
        }
        //数组中都为9，那么对数组扩容，使第一位为1，后面都为0
        int[] a = new int[digits.length + 1];
        a[0] = 1;
        return a;
    }

    //错误思路
//    public int[] plusOne(int[] digits) {
//        if(digits[digits.length - 1] < 9){
//            digits[digits.length - 1]++;
//        }else{
//            int[] a = new int[digits.length + 1];
//            for(int i = 1;i < digits.length + 1;i++){
//                a[i] = digits[i - 1];
//            }
//            int b = a.length - 1;
//            while(a[b] == 9){
//                a[b] = 0;
//                a[b - 1]++;
//                b--;
//            }
//            digits = a;
//        }
//        return digits;
//    }

}
