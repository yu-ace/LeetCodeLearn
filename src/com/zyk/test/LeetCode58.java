package com.zyk.test;

/**
 * 给你一个字符串 s，由若干单词组成，单词前后用一些空格字符隔开。返回字符串中 最后一个 单词的长度。
 *
 * 单词 是指仅由字母组成、不包含任何空格字符的最大子字符串。
 */
public class LeetCode58 {

    public static void main(String[] args) {
        String s = "Hello World   ";
        lengthOfLastWord(s);
        System.out.println(1);
    }

    public static int lengthOfLastWord(String s) {
        int end = s.length() - 1;
        while (end >= 0 && s.charAt(end) == ' '){
            end--;
        }if(end < 0){
            return 0;
        }
        int start = end;
        while (start >= 0 && s.charAt(start) != ' '){
            start--;
        }
        return end - start;
    }
}
