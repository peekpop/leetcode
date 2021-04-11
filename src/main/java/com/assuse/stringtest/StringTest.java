package com.assuse.stringtest;

/**
 * @author cobra
 * @link www.assuse.com
 * @date 2021/4/10
 * @description
 */
public class StringTest {
    public static void main(String[] args) {
        String s = "aabbcddeef";
        char c = firstUniqChar(s);
        System.out.println(c);
    }

    public static char firstUniqChar(String s) {
        if (s.equals("")) return ' ';
        //创建‘a'-'z'的字典
        int[] target = new int[26];
        //第一次遍历，将字符统计到字典数组
        for (int i = 0; i < s.length(); i++) {
            System.out.println(s.charAt(i) - 'a');
            target[s.charAt(i) - 'a']++;
        }
        //第二次遍历，从字典数组获取次数
        for (int i = 0; i < s.length(); i++) {
            if (target[s.charAt(i) - 'a'] == 1) return s.charAt(i);
        }

        return ' ';
    }

}
