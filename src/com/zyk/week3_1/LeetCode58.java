package com.zyk.week3_1;

/**
 * 给你一个字符串 s，由若干单词组成，单词前后用一些空格字符隔开。返回字符串中 最后一个 单词的长度。
 *
 * 单词 是指仅由字母组成、不包含任何空格字符的最大子字符串。
 */
public class LeetCode58 {

    public int lengthOfLastWord(String s) {
        int n = s.length() - 1;
        while(n >= 0 && s.charAt(n) ==' '){
            n--;
        }if(n < 0){
            return 0;
        }
        int m = n;
        while(m >= 0 && s.charAt(m) !=' '){
            m--;
        }
        return n-m;
    }
}
