package com.wanghu.day2;

/**
 *找出字符串中出现次数最多的字符，相同字符返回 ASCII 小的字符
 *
 * 提示：
 * 1.默认都是小写字母
 * 2.只能返回字母
 * 3.字符串长度大于0小于999
 *
 *
 * @author wanghu
 * @see [相关类/方法]（可选）
 * @since [产品/模块版本] （可选）
 */
public class Solution {

    public static void main(String[] args) {
        String a = "abcdeadd\"\"\"\"\"\"";

        System.out.println(getCharacter(a));

    }

    public static Character getCharacter(String a) {
        char[] chars = a.toCharArray();
        int[] ch = new int[26];

        //先筛选出小写字母
        for (char char1 : chars ) {
            if (char1 >= 97 && char1 <= 121) {
                ch[char1 -97]++;
            }
        }

        //找出数值最大的下标
        int index = 0;
        for (int i = 1; i < ch.length; i++) {
            if (ch[i] > ch[index]) {
                index = i;
            }
        }

        //下标加上97得到具体字母
        return (char)(index + 97);
    }
}
