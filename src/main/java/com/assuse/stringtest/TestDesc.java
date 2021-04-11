package com.assuse.stringtest;

import java.util.HashMap;
import java.util.Map;

/**
 * @author cobra
 * @link www.assuse.com
 * @date 2021/4/11
 * @description 求两数之和
 */
public class TestDesc {

    public static void main(String[] args) {
        int[] nums = new int[]{2,11,15,7};
        int target = 9;
        int[] ints = twoSum(nums, target);
        System.out.println("array value:" + ints);
    }

    public static int[] twoSum(int[] nums, int target) {
        Map<Integer, Integer> map = new HashMap<Integer, Integer>();
        for (int i = 0; i < nums.length; i++) {
            int res = target - nums[i];
            if (map.containsKey(res)) {
                return new int[]{map.get(res), i};
            }
            map.put(nums[i], i);
        }
        return new int[0];
    }
}
