package com.sort.bubble;

import java.util.Arrays;
import java.util.Objects;

/**
 * 冒泡排序<br>
 *
 * @author wanghu
 * @see [相关类/方法]（可选）
 * @since [产品/模块版本] （可选）
 */
public class bubble {

    public static void main(String[] args) {
        //待排序数组
        int[] array = {1, 4, 6, 2, 9, 11, 6, 8, 16, 0};
        bubbleSort2(array);
    }

    /**
     * @param array 待排序数组
     * @return
     */
    private static int[] bubbleSort2(int[] array) {
        if (Objects.isNull(array) || array.length == 0) {
            return null;
        }

        System.out.println("原数组顺序:" + Arrays.toString(array) + "\n");

        //标记位，如果内排序已有序则跳出循环
        boolean flag = true;
        int temp;
        for (int i = 0; i < array.length && flag; i++) {
            flag = false;
            for (int j = 0; j < array.length - 1 - i; j++) {
                if (array[j] < array[j + 1]) {
                    temp = array[j + 1];
                    array[j + 1] = array[j];
                    array[j] = temp;
                    flag = true;
                }
            }
            System.out.println("第" + (i + 1) + "轮循环后：" + Arrays.toString(array));
        }
        System.out.println();
        System.out.println("排序后数组顺序:" + Arrays.toString(array));
        return array;
    }

}
