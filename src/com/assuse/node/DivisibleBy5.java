package com.assuse.node;

import java.util.ArrayList;
import java.util.List;

/**
 * @author cobra
 * @link www.assuse.com
 * @date 2021/1/14
 * @description 可被 5 整除的二进制前缀
 */
public class DivisibleBy5 {
    public static void main(String[] args) {
        int[] val = new int[]{0,1,1,1,1,1};
        System.out.println("位运算结果值：" + (5 >> 1));
        List<Boolean> list = prefixesDivBy5(val);
        System.out.println("结果值为：" + list.toString());
    }

    /**
     * << 左移计算补码底位补0
     * >> 右移计算补码高位补0
     * 5<<1  0000 0101  ——> 0000 1010
     * 5>>1  0000 0101  ——> 0000 0010
     * @param A
     * @return
     */
    public static List<Boolean> prefixesDivBy5(int[] A) {
        List<Boolean> list = new ArrayList<Boolean>();
        int prefix = 0;
        int length = A.length;
        for (int i = 0; i < length; i++) {
            prefix = ((prefix << 1) + A[i]) % 5;
            list.add(prefix == 0);
        }
        return list;
    }
}
