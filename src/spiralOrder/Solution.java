package spiralOrder;

public class Solution {
    public int[] spiralOrder(int[][] matrix) {
        int higth = matrix.length;
        if (higth == 0) {
            return new int[0];
        }
        int width = matrix[0].length;
        if (width == 0) {
            return new int[0];
        }
        int[] ans = new int[higth * width];
        boolean[][] map = new boolean[higth][width];

        int x = 0;
        int y = 0;
        int[][] dirMap = {{0, 1}, {1, 0}, {0, -1}, {-1, 0}};
        int dir = 0;

        for (int i = 0; i < higth * width; i++) {
            ans[i] = matrix[x][y];
            map[x][y] = true;
            if ((x + dirMap[dir][0] >= higth) || (y + dirMap[dir][1] >= width) || (x + dirMap[dir][0] < 0) || (y + dirMap[dir][1] < 0) || map[x + dirMap[dir][0]][y + dirMap[dir][1]]) {
                dir = (dir + 1) % 4;
            }
            x += dirMap[dir][0];
            y += dirMap[dir][1];
        }

        return ans;
    }
}
