package com.zyk.week3;

/**
 * 给你一个字符串 s，由若干单词组成，单词前后用一些空格字符隔开。返回字符串中 最后一个 单词的长度。
 *
 * 单词 是指仅由字母组成、不包含任何空格字符的最大子字符串。
 */
public class LeetCode58 {

//    public int lengthOfLastWord(String s) {
//        int a = 0;
//        String[] temp;
//        temp = s.split(" ");
//        a = temp[temp.length - 1].length();
//        return a;
//    }

    public int lengthOfLastWord(String s) {
        int end = s.length() -  1;
        while(end >= 0 && s.charAt(end) == ' '){
            end--;
        }if(end < 0){
            return 0;
        }
        int start = end;
        while(start >= 0 && s.charAt(start) != ' '){
           start--;
        }
        return end - start;
    }

}
