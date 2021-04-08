package com.assuse.iplus;

/**
 * @author cobra
 * @link www.assuse.com
 * @date 2021/4/8
 * @description i++
 */
public class Iplus {
    public static void main(String[] args) {
        int i = 1;
        i = i++;
        int j = i++;
        int k = i + ++i * i++;
        System.out.println("i=" + i);
        System.out.println("j=" + j);
        System.out.println("k=" + k);
    }
}
