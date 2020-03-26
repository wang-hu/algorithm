package com.wanghu.day5;


import java.util.Arrays;

/**
 输入整数数组 arr ，找出其中最小的 k 个数。例如，输入4、5、1、6、2、7、3、8这8个数字，则最小的4个数字是1、2、3、4。

 示例 1：
 输入：arr = [3,2,1], k = 2
 输出：[1,2] 或者 [2,1]

 示例 2：
 输入：arr = [0,1,2,1], k = 1
 输出：[0]

 限制：

 0 <= k <= arr.length <= 10000
 0 <= arr[i] <= 10000
 *
 * @author wanghu
 * @see [相关类/方法]（可选）
 * @since [产品/模块版本] （可选）
 */
public class Solution {

    public static void main(String[] args) {
        int[] arr = {3,2,1};

        System.out.println(Arrays.toString(getLeastNumbers1(arr, 2)));

    }


    /**
     * 1.先对原数组排序
     * 2.获取最值
     * @param arr
     * @param k
     * @return
     */
    public static int[] getLeastNumbers(int[] arr, int k) {

        int[] newArr = new int[k];

        int temp;
        boolean flag = true;
        for (int i = 0; i < arr.length && flag; i++) {
            flag = false;
            for (int j = 0; j < arr.length - 1 - i; j++) {
                if (arr[j] > arr [j + 1]) {
                    temp = arr[j];
                    arr[j] = arr[j + 1];
                    arr[j + 1] = temp;
                    flag = true;
                }
            }
        }

        for (int i = 0; i < k; i++) {
            newArr[i] = arr[i];
        }

        return newArr;
    }

    public static int[] getLeastNumbers1(int[] arr, int k) {
        int[] newArr = new int[10000];
        //计算数字出现的次数，并排序
        for (int i = 0; i < arr.length; i++) {
            newArr[9999 - arr[i]]++;
        }


        int[] rtnArr = new int[k];
        int len = 0;

        for (int i = 10000 - 1; i >= 0 ; i--) {
            if (len == k) {
                break;
            }
            //取出最小的k 个数
            int size = newArr[i];
            while (len < k && size > 0) {
                rtnArr[len] = 9999 - i;
                len++;
                size --;
            }
        }

        return rtnArr;
    }
}
