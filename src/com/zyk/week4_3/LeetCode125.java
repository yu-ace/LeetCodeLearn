package com.zyk.week4_3;

/**
 * 如果在将所有大写字符转换为小写字符、并移除所有非字母数字字符之后，短语正着读和反着读都一样。则可以认为该短语是一个 回文串 。
 *
 * 字母和数字都属于字母数字字符。
 *
 * 给你一个字符串 s，如果它是 回文串 ，返回 true ；否则，返回 false 。
 */
public class LeetCode125 {

    public static void main(String[] args) {
        String s = "A man, a plan, a canal: Panama";
        boolean palindrome = isPalindrome(s);
        System.out.println(1);
    }

    public static boolean isPalindrome(String s){
        int n = s.length();
        int left = 0;
        int right = n - 1;
        while(left < right){
            while (left < right && !Character.isLetterOrDigit(s.charAt(left))){
                left++;
            }
            while (left < right && !Character.isLetterOrDigit(s.charAt(right))){
                right--;
            }
            if(left < right){
                if(Character.toLowerCase(s.charAt(left)) != Character.toLowerCase(s.charAt(right))){
                    return false;
                }
                left++;
                right--;
            }
        }
        return true;
    }

}
