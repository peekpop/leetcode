package com.assuse.array;

/**
 * @author cobra
 * @link www.assuse.com
 * @date 2021/4/9
 * @description
 */
public class ArrayInt {
    public static void main(String[] args) {
        int[] arr = new int[]{1, 2, 4, 5, 5, 2, 1};
        int num = findNum(arr);
        System.out.println(num);

    }

    /**
     * 找出数组中只出现一次的数字
     *
     * @param nums
     * @return
     */
    public static int findNum(int[] nums) {
        int result = 0;
        for (int i = 0; i < nums.length; i++) {
            result = result ^ nums[i];
        }
        return result;
    }


}
