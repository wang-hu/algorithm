package com.leetcode.day8;

/**
 链表的中间结点
 给定一个带有头结点 head 的非空单链表，返回链表的中间结点。

 如果有两个中间结点，则返回第二个中间结点。
 * @author wanghu
 * @see [相关类/方法]（可选）
 * @since [产品/模块版本] （可选）
 */
public class Solution {

    public static void main(String[] args) {
        //[1,2,3,4,5]
        ListNode head = new ListNode(1);
        head.next = new ListNode(2);
        head.next.next = new ListNode(3);
        head.next.next.next = new ListNode(4);
        head.next.next.next.next = new ListNode(5);

        System.out.println(middleNode(head));
    }

    public static ListNode middleNode(ListNode head) {
        if (head.next == null) {
            return head;
        }

        ListNode tempOne = head;
        ListNode tempTwo = head;

        while (tempOne  != null) {
            if (tempTwo == null || tempTwo.next == null) {
                return tempOne;
            } else {
                tempOne = tempOne.next;
                tempTwo = tempTwo.next.next;
            }
        }

        return tempOne;

    }


}


class ListNode {
    int val;
    ListNode next;
    ListNode(int x) { val = x; }
}

