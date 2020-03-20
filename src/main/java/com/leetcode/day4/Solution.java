package com.leetcode.day4;

/**
 给定一个包含大写字母和小写字母的字符串，找到通过这些字母构造成的最长的回文串。
 在构造过程中，请注意区分大小写。比如 "Aa" 不能当做一个回文字符串。

 注意:
 假设字符串的长度不会超过 1010。

 示例 1:
 输入:
 "abccccdd"
 输出:
 7

 解释:
 我们可以构造的最长的回文串是"dccaccd", 它的长度是 7。
 *
 * @author wanghu
 * @see [相关类/方法]（可选）
 * @since [产品/模块版本] （可选）
 */
public class Solution {
    public static void main(String[] args) {

        //A-65-90 a-97-122

        String s = "bb";
        System.out.println(longestPalindrome(s));
    }


    public static int longestPalindrome(String s) {
        if (s.length() == 1) {
            return 1;
        }

        char[] ch = new char[128];
        char[] sCh = s.toCharArray();

        //统计字母出现次数
        for (int i = 0; i < sCh.length; i++) {
            ch[sCh[i]]++;
        }

        int len = 0;
        for (int i = 0; i < ch.length; i++) {
            //与1&为1是奇数，0则为偶数
            //奇数则长度-1，偶数直接累加
            len += ((ch[i] & 1) == 1 ? ch[i] - 1 : ch[i]);

            //只增加一个奇数
            if (len % 2 == 0 && ch[i] % 2 == 1 ) {
                len++;
            }
        }

        return len;
    }
}
