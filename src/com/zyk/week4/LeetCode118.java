package com.zyk.week4;

import java.util.ArrayList;
import java.util.List;

/**
 * 给定一个非负整数 numRows，生成「杨辉三角」的前 numRows 行。
 *
 * 在「杨辉三角」中，每个数是它左上方和右上方的数的和。
 *
 * 需要了解用List创建二维数组的方法，以及注意取值需要用方法。
 */
public class LeetCode118 {

    public List<List<Integer>> generate(int numRows) {
        List<List<Integer>> a = new ArrayList<List<Integer>>();
        for(int i = 0;i < numRows;i++){
            List<Integer> b = new ArrayList<>();
            for(int j = 0;j <= i;j++){
                if(j == 0 || i == j){
                    b.add(1);
                }else{
                    b.add(a.get(i-1).get(j-1) + a.get(i-1).get(j));
                }
            }
            a.add(b);
        }
        return a;
    }

}
