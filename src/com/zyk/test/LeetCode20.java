package com.zyk.test;

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

    public static Map<Character,Character> map = new HashMap<Character, Character>(){{
        put('{','}');
        put('[',']');
        put('(',')');
        put('?','?');
    }};

    public boolean isValid(String s){
        if(s.length() >0 && !map.containsKey(s.charAt(0))){
            return false;
        }
        LinkedList<Character> stack = new LinkedList<>();
        stack.add('?');
        for(Character character:s.toCharArray()){
            if(map.containsKey(character)){
                stack.addLast(character);
            }else if(map.get(stack.removeLast()) != character){
                return false;
            }
        }
        return stack.size() == 1;
    }

}
