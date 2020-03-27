package com.wanghu.day11;

/**
 * 〈一句话功能简述〉
 *
 * @author wanghu
 * @see [相关类/方法]（可选）
 * @since [产品/模块版本] （可选）
 */
public class Solution {

    public static void main(String[] args) {
        int[] digits = {9,8,7,6,5,4,3,2,1,0};
        System.out.println(plusOne(digits));
    }


    public static int[] plusOne(int[] digits) {

        int[] reverses = new int[digits.length +  1];
        for (int i = 0; i < digits.length; i++) {
            reverses[digits.length - i - 1] = digits[i];
        }

        for (int i = 0; i < reverses.length; i++) {
            if ((reverses[i] + 1) < 10) {

            }
        }




        return reverses;


    }
}
