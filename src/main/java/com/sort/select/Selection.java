package com.sort.select;

import java.util.Arrays;
import java.util.Objects;

/**
 * 选择排序 <br>
 *
 * @author wanghu
 * @see [相关类/方法]（可选）
 * @since [产品/模块版本] （可选）
 */
public class Selection {

    public static void main(String[] args) {
        int[] array = {1, 3, 7, 2, 9, 11, 6, 8, 16, 0};

        selectSort(array);
    }

    /**
     * 选择排序
     * @param array 待排序数组
     */
    private static void selectSort(int[] array) {
        if (Objects.isNull(array) || array.length == 0) {
            return;
        }

        System.out.println("原数组顺序:" + Arrays.toString(array) + "\n");

        int max = 0;
        int temp;
        for (int i = 0; i < array.length - 1; i++) {
            for (int j = i + 1; j < array.length; j++) {
                if (array[max] < array[j]) {
                    //内循环，每一次找出最值
                    max = j;
                }
            }

            //进行交换
            if (max != i) {
                temp = array[max];
                array[max] = array[i];
                array[i] = temp;
            }

            System.out.println(Arrays.toString(array));
        }

        System.out.println("排序后数组顺序:" + Arrays.toString(array));
    }
}
