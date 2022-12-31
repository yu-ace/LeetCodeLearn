package com.zyk.week3_3;

/**
 * 给你两个二进制字符串 a 和 b ，以二进制字符串的形式返回它们的和。
 */
public class LeetCode67 {

    public String addBinary(String a, String b){
        int m = a.length();
        int n = b.length();
        if(m < n){
            String x = "";
            for(int i = 0;i < n - m;i++){
                x = x + 0;
            }
            a = x + a;
            m = n;
        }else if(m > n){
            String x = "";
            for(int i = 0;i < m - n;i++){
                x = x + 0;
            }
            b = x + b;
        }
        int c = 0;
        StringBuilder stringBuilder = new StringBuilder();
        for(int i = m - 1;i >= 0;i--){
            int a1 = 0;
            int b1 = 0;
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
            int sum = (a1 + b1 + c) % 2;
            c = (a1 + b1 + c) / 2;
            stringBuilder.append(sum);
        }
        if(c == 1){
            stringBuilder.append(c);
        }
        return stringBuilder.reverse().toString();
    }

}
