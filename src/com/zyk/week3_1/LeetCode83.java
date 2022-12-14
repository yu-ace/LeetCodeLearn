package com.zyk.week3_1;

/**
 * 给定一个已排序的链表的头 head ， 删除所有重复的元素，使每个元素只出现一次 。返回 已排序的链表 。
 */
public class LeetCode83 {

    public ListNode1 deleteDuplicates(ListNode1 head) {
        if(head == null){
            return head;
        }
        ListNode1 p = head;
        while(p.next != null){
            if(p.val == p.next.val) {
                p.next = p.next.next;
            }else{
                p = p.next;
            }
        }
       return head;
    }
}
