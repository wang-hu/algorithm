package com.wanghu.day10;

/**
 * 寻找数组的中心索引
 *
 * @author wanghu
 * @see [相关类/方法]（可选）
 * @since [产品/模块版本] （可选）
 */
public class Solution {

    public static void main(String[] args) {
        int[] nums = {1, 7, 3, 6, 5, 6};
        System.out.println(pivotIndex1(nums));
    }

    /**
     * 个人解答
     * @param nums
     * @return
     */
    public static int pivotIndex(int[] nums) {
        if (nums.length <= 1) {
            return -1;
        }

        int leftV = 0;
        for (int i = 0; i < nums.length; i++) {
            //0不赋值
            if (i != 0) {
                leftV += nums[i - 1];
            }

            int rightV = 0;
            for (int j = i + 1; j < nums.length; j++) {
                rightV += nums[j];
            }

            if (leftV == rightV) {
                return i;
            }
        }
        return -1;
    }

    /**
     * 最优解答
     * @param nums
     * @return
     */
    public static int pivotIndex1(int[] nums) {
        int leftV = 0;
        int sum = 0;
        for (int i = 0; i < nums.length; i++) {
            sum += nums[i];
        }

        for (int j = 0; j < nums.length; j++) {
            if (leftV == sum - leftV - nums[j]) {
                return j;
            } else {
                leftV += nums[j];
            }
        }
        return -1;
    }
}
