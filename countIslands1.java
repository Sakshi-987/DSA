import java.util.*;

public class countIslands1 {
    // Given an m x n 2D binary grid grid which represents a map of '1's (land) and
    // '0's (water), return the number of islands.

    // An island is surrounded by water and is formed by connecting adjacent lands
    // horizontally or vertically. You may assume all four edges of the grid are all
    // surrounded by water.

    // you've to consider all 4 direc horizontals and verticals only

    static class Pair {
        int rowIdx;
        int colIdx;

        public Pair(int r, int c) {
            this.rowIdx = r;
            this.colIdx = c;
        }
    }
    // using Pair object in queue i.e bfs

    public static int countIsland(char[][] grid) {
        if (grid == null || grid.length == 0)
            return 0; // corner case
        // not making vis matrix , once we check for a partcular ele we store '0' at
        // grid position there
        // so we don't traverse it again , also no extra space for vis matrix required
        int count = 0;
        for (int i = 0; i < grid.length; i++) {
            for (int j = 0; j < grid[0].length; j++) {
                if (grid[i][j] == '1') {
                    count++;
                    // dfs(grid, i, j);
                    bfs(grid,i,j);
                    // can use any of two bfs or dfs
                }
            }
        }
        return count;
    }

    // dfs approach
    public static void dfs(char[][] grid, int row, int col) {
        grid[row][col] = '0'; // 0 as it's vis making changes in grid only to identify visited one
        int[] dRow = { -1, 0, 1, 0 }; // up , right , down , left
        int[] dCol = { 0, 1, 0, -1 }; // same
        // can visit neigh in any direc but dRow and dCol direc sequence should match ,
        // moving cloackwise
        // dRow & dCol means delta row and col , changes you make in row for finding
        // neigh
        for (int i = 0; i < 4; i++) {
            int newR = row + dRow[i];
            int newC = col + dCol[i];
            if (newR >= 0 && newR < grid.length && newC >= 0 && newC < grid[0].length && grid[newR][newC] == '1') {
                grid[newR][newC] = '0';
                dfs(grid, newR, newC);
            }
        }
    }

    // bfs
    public static void bfs(char[][] grid, int row, int col) {
        Queue<Pair> q = new LinkedList<>();
        // visiting the island
        grid[row][col] = '0';
        q.add(new Pair(row, col)); // adiing row and col index in q

        // storing direction changes
        int[] dRow = { -1, 0, 1, 0 };
        int[] dCol = { 0, 1, 0, -1 };

        while (!q.isEmpty()) {
            int currR = q.peek().rowIdx; // gives row idx
            int currC = q.peek().colIdx; // gives col idx
            q.remove(); // removing so it can't be vis again
            for (int i = 0; i < 4; i++) {
                int newR = currR + dRow[i];
                int newC = currC + dCol[i];
                if (newR >= 0 && newR < grid.length && newC >= 0 && newC < grid[0].length && grid[newR][newC] == '1') {
                    grid[newR][newC] = '0';
                    q.add(new Pair(newR, newC));
                }
            }
        }
    }

    public static void main(String[] args) {
        char[][] grid = {
                { '1', '0', '0', '0', '0' },
                { '1', '1', '0', '0', '0' },
                { '0', '0', '1', '0', '0' },
                { '0', '0', '0', '1', '1' }
        };
        System.out.println(countIsland(grid));
    }
}
