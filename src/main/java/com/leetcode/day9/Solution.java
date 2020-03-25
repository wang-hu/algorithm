package com.leetcode.day9;

/**
 在 N * N 的网格上，我们放置一些 1 * 1 * 1  的立方体。
 每个值 v = grid[i][j] 表示 v 个正方体叠放在对应单元格 (i, j) 上。
 请你返回最终形体的表面积。

 来源：力扣（LeetCode）
 链接：https://leetcode-cn.com/problems/surface-area-of-3d-shapes
 著作权归领扣网络所有。商业转载请联系官方授权，非商业转载请注明出处。
 *
 * @author wanghu
 * @see [相关类/方法]（可选）
 * @since [产品/模块版本] （可选）
 */
public class Solution {
    public static void main(String[] args) {

    }

    public static int surfaceArea(int[][] grid) {
        int[] dr = new int[]{0, 1, 0, -1};
        int[] dc = new int[]{1, 0, -1, 0};

        int N = grid.length;
        int ans = 0;

        for (int r = 0; r < N; ++r)
            for (int c = 0; c < N; ++c)
                if (grid[r][c] > 0) {
                    ans += 2;
                    for (int k = 0; k < 4; ++k) {
                        int nr = r + dr[k];
                        int nc = c + dc[k];
                        int nv = 0;
                        if (0 <= nr && nr < N && 0 <= nc && nc < N)
                            nv = grid[nr][nc];

                        ans += Math.max(grid[r][c] - nv, 0);
                    }
                }

        return ans;
    }
}
