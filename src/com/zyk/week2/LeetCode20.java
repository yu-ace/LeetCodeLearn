package com.zyk.week2;

import java.util.HashMap;
import java.util.LinkedList;
import java.util.Map;

/**
 * 给定一个只包括 '('，')'，'{'，'}'，'['，']' 的字符串 s ，判断字符串是否有效。
 *
 * 有效字符串需满足：
 *
 * 左括号必须用相同类型的右括号闭合。
 * 左括号必须以正确的顺序闭合。
 * 每个右括号都有一个对应的相同类型的左括号。
 */
public class LeetCode20 {

    public static void main(String[] args) {
        System.out.println(isValid("({})"));
    }

    private static Map<Character , Character> map = new HashMap<Character , Character>(){{
        put('{','}');
        put('(',')');
        put('[',']');
        put('?','?');
    }};

    public static boolean isValid(String s) {
        //如果字符串第一位就不匹配，直接返回false
        if(s.length() > 0 && !map.containsKey(s.charAt(0))){
            return false;
        }
        LinkedList<Character> stack = new LinkedList<>();
        //避免第一个就为右括号，stack.removeLast为空而报错
        stack.addLast('?');
        for(Character c : s.toCharArray()){
            //将遍历的左括号依次添加进链表中；
            if(map.containsKey(c)){
                stack.addLast(c);
            //遍历至右括号，如果右括号与链表中最后进入的左括号不匹配，那么返回false；
            }else if(map.get(stack.removeLast()) != c){
                return false;
            }
        }
        //由于链表中第一位是'?',所有最后数量为1时，符合题目要求，为true
        return stack.size() == 1;
    }


}
