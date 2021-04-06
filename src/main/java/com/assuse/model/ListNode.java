package com.assuse.model;

/**
 * @author cobra
 * @link www.assuse.com
 * @date 2021/1/11
 * @description
 */
public class ListNode {
    int val;
    //链表指向的下一个值的指针
    ListNode next;

    //这个方式赋值
    ListNode(int x) {
        val = x;
    }

    public int getVal() {
        return val;
    }

    public void setVal(int val) {
        this.val = val;
    }

    public ListNode getNext() {
        return next;
    }

    public void setNext(ListNode next) {
        this.next = next;
    }
}
