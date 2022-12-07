package com.zyk.week3_1;

/**
 * 给你两个二进制字符串 a 和 b ，以二进制字符串的形式返回它们的和。
 */
public class LeetCode67 {

    public static void main(String[] args) {
        String a = "11";
        String b = "1";
        System.out.println(addBinary(a,b));
    }
    public static String addBinary(String a, String b) {
        int m = a.length();
        int n = b.length();
        if(m < n){
            String act = "";
            for(int i = 0;i < n - m;i++){
                act = act + "0";
            }
            a = act + a;
            m = n;
        }else if(m > n){
            String act = "";
            for(int i = 0;i < m - n;i++){
                act = act + "0";
            }
            b = act + b;
        }
        int c = 0;
        StringBuilder stringBuilder = new StringBuilder();
        for(int i = m - 1;i >= 0;i--){
            int a1;
            int b1;
            if(a.charAt(i) == '0'){
                a1 = 0;
            }else{
                a1 = 1;
            }
            if(b.charAt(i) == '0'){
                b1 = 0;
            }else{
                b1 = 1;
            }
            int cut = (a1 + b1 + c) % 2;
            c = (a1 + b1 + c) / 2;
            stringBuilder.append(cut);
        }
        if(c == 1){
            stringBuilder.append(c);
        }
        return stringBuilder.reverse().toString();
    }

}
