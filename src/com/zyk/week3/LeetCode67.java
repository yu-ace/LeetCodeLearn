package com.zyk.week3;


/**
 * 给你两个二进制字符串 a 和 b ，以二进制字符串的形式返回它们的和。
 *
 * 当前位 = (运算数运算 + 进位) % 进制
 * 进位 =  (运算数运算 + 进位) / 进制
 *
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
                act += "0"; //等同于 act = act + "0"
            }
            a = act + a;//顺序不能写反
            m = n;
        }else if(m > n){
            String act = "";
            for(int i = 0;i < m-n;i++){
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
            int cur = (a1 + b1 + c) % 2;
            c = (a1 + b1 + c) / 2;
            stringBuilder.append(cur);
        }
        if(c == 1){
            stringBuilder.append(c);
        }
        return stringBuilder.reverse().toString();
    }

//    public static String addBinary(String a, String b) {
//        int m = a.length(), n = b.length();
//        if(m < n){ // 补齐字符串
//            String attach = "";
//            for(int i = 0; i < n - m; i++) attach += "0";
//            a = attach + a;
//            m = n; // 让m代表较长的那个字符串
//        }
//        else if(m > n){
//            String attach = "";
//            for(int i = 0; i < m - n; i++) attach += "0";
//            b = attach + b;
//        }
//        int carry = 0;
//        StringBuilder sb = new StringBuilder();
//        for(int i = m - 1; i >= 0; i--){ // 从最低位开始
//            int ai = a.charAt(i) == '0' ? 0 : 1;
//            int bi = b.charAt(i) == '0' ? 0 : 1;
//            int cur = (ai + bi + carry) % 2; // 当前位
//            carry = (ai + bi + carry) / 2; // 进位
//            sb.append(cur);
//        }
//        if(carry == 1) sb.append(carry); // 最高位仍有进位时
//        return sb.reverse().toString(); // 翻转
//    }


//    public String addBinary(String a, String b) {
//        StringBuilder sb = new StringBuilder();
//        int m = a.length() - 1, n = b.length() - 1;
//        int carry = 0;
//        while(m >= 0 || n >= 0){ // 从最低位开始，只要位数较多的那个数还未运算完毕就继续
//            int ai = m >= 0 ? a.charAt(m) - '0' : 0;
//            int bi = n >= 0 ? b.charAt(n) - '0' : 0;
//            m--; n--;
//            int cur = (ai + bi + carry) % 2; // 当前位
//            carry = (ai + bi + carry) / 2; // 进位
//            sb.append(cur);
//        }
//        if(carry == 1) sb.append(carry); // 最高位仍有进位时
//        return sb.reverse().toString(); // 翻转
//    }
}
