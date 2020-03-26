package com.wanghu.day7;


/**
 *
 * 使数组唯一的最小增量
 *
 * @author wanghu
 * @see [相关类/方法]（可选）
 * @since [产品/模块版本] （可选）
 */
public class Solution {

    public static void main(String[] args) {
        int[] arr = {0};
        System.out.println(minIncrementForUnique(arr));
    }

    public static int minIncrementForUnique1(int[] arr) {
        if (arr.length <= 1) {
            return 0;
        }
        int count = 0;

        boolean flag = true;
        for (int i = 0; i < arr.length && flag; i++) {
            flag = false;
            for (int j = 0; j < arr.length - i - 1; j++) {
                if (arr[j] > arr[j + 1]) {
                    int temp = arr[j];
                    arr[j] = arr[j + 1];
                    arr[j + 1] = temp;
                    flag = true;
                }
            }
        }

        

        return count;
    }


    public static int minIncrementForUnique(int[] arr) {
        if (arr.length <= 1) {
            return 0;
        }

        int count = 0;
        for (int i = 0; i < arr.length - 1; i++) {
            for (int j = i + 1; j < arr.length; j++) {
                if ((arr[i] ^ arr[j]) == 0) {
                    arr[j]++;
                    count++;
                    i = -1;
                    break;
                }
            }
        }

        return count;
    }
}
