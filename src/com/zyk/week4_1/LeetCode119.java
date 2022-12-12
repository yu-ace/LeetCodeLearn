package com.zyk.week4_1;

import java.util.ArrayList;
import java.util.List;

/**
 * 给定一个非负索引 rowIndex，返回「杨辉三角」的第 rowIndex 行。
 *
 * 在「杨辉三角」中，每个数是它左上方和右上方的数的和。
 */
public class LeetCode119 {

    public List<Integer> getRow(int rowIndex){
        List<List<Integer>> a = new ArrayList<List<Integer>>();
        for(int i = 0;i <= rowIndex;i++){
            List<Integer> b = new ArrayList<>();
            for(int j = 0;j <= i;j++){
                if(j == 0 || j == i){
                    b.add(1);
                }else{
                    b.add(a.get(i-1).get(j-1) + a.get(i-1).get(j));
                }
            }
            a.add(b);
        }
        return a.get(rowIndex);
    }

}
