package com.wanghu.day15;

/**
 * Sort an Array
 *
 * 给你一个整数数组 nums，请你将该数组升序排列。

 示例 1：
 输入：nums = [5,2,3,1]
 输出：[1,2,3,5]

 示例 2：
 输入：nums = [5,1,1,2,0,0]
 输出：[0,0,1,1,2,5]
  
 提示：
 1 <= nums.length <= 50000
 -50000 <= nums[i] <= 50000

 来源：力扣（LeetCode）
 链接：https://leetcode-cn.com/problems/sort-an-array
 著作权归领扣网络所有。商业转载请联系官方授权，非商业转载请注明出处。
 *
 * @author wanghu
 * @see [相关类/方法]（可选）
 * @since [产品/模块版本] （可选）
 */
public class Solution {

    public int[] sortArray(int[] nums) {
        int max = -50001, min = 50001;
        for (int num: nums) {
            max = Math.max(num, max);
            min = Math.min(num, min);
        }


        int[] counter = new int[max - min + 1];
        for (int num: nums) {
            counter[num - min]++;
        }

        int idx = 0;
        for (int num = min; num <= max; num++) {
            int cnt = counter[num - min];
            while (cnt-- > 0) {
                nums[idx++] = num;
            }
        }
        return nums;
    }
}
