package com.leetcode.day2;

import java.util.*;

/**
 *
 字符串压缩。利用字符重复出现的次数，编写一种方法，实现基本的字符串压缩功能。
 比如，字符串aabcccccaaa会变为a2b1c5a3。若“压缩”后的字符串没有变短，则返回原先的字符串。
 你可以假设字符串中只包含大小写英文字母（a至z）。

 示例1:
 输入："aabcccccaaa"
 输出："a2b1c5a3"

 示例2:
 输入："abbccd"
 输出："abbccd"
 解释："abbccd"压缩后为"a1b2c2d1"，比原字符串长度更长。

 提示：
 字符串长度在[0, 50000]范围内。

 来源：力扣（LeetCode）
 链接：https://leetcode-cn.com/problems/compress-string-lcci
 著作权归领扣网络所有。商业转载请联系官方授权，非商业转载请注明出处。
 * @author wanghu
 * @see [相关类/方法]（可选）
 * @since [产品/模块版本] （可选）
 */
public class Solution1 {

    public static void main(String[] args) {
        String str = "abbccd";

        System.out.println(compressString(str));
    }

    public static String compressString(String string) {
        if (Objects.isNull(string) || string.length() <= 2) {
            return string;
        }

        int count = 1;
        char[] chars = string.toCharArray();
        StringBuilder sb = new StringBuilder();
        for (int i = 0; i < chars.length - 1; i++) {
            //异或比较，相同为0
            if ((chars[i] ^ chars[i + 1]) == 0) {
                count++;
            } else {
                sb.append(chars[i]).append(count);
                count = 1;
            }
        }

        //填充最后一个统计字符
        sb.append(chars[chars.length - 1]).append(count);

        if (sb.length() >= string.length()) {
            return string;
        } else {
            return sb.toString();
        }
    }

}
