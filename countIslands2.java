import java.util.*;

public class countIslands2 {
    // again we've to cunt islands. but this time in all direction i.e horizontals ,
    // verticals, diagonals

    // doing by both dfs and bfs method

    // can find directions change using loop direc changes vary from (-1 to 1) for
    // both row and col

    // dRow=[-1,-1,0,1,1,1,0,-1] & dCol = [0,1,1,1,0,-1,-1,-1]
    // or storing the changes in array form

    static class Pair {
        int rowIdx;
        int colIdx;

        public Pair(int r, int c) {
            this.rowIdx = r;
            this.colIdx = c;
        }
    }

    public static int countIsland(char[][] grid) {
        int count = 0;
        for (int i = 0; i < grid.length; i++) {
            for (int j = 0; j < grid[0].length; j++) {
                if (grid[i][j] == 'L') {
                    count++;
                    // dfs(grid, i, j);
                    bfs(grid, i, j);
                }
            }
        }
        return count;
    }
    
    // Time complexity = O(n*m)

    // bfs
    public static void bfs(char[][] grid, int row, int col) {
        Queue<Pair> q = new LinkedList<>();
        grid[row][col] = 'W';
        q.add(new Pair(row, col));

        while (!q.isEmpty()) {
            int currR = q.peek().rowIdx;
            int currC = q.peek().colIdx;
            q.remove();

            for (int dRow = -1; dRow <= 1; dRow++) {
                for (int dCol = -1; dCol <= 1; dCol++) {
                    int newR = currR + dRow;
                    int newC = currC + dCol;
                    if (newR >= 0 && newR < grid.length && newC >= 0 && newC < grid[0].length
                            && grid[newR][newC] == 'L') {
                        grid[newR][newC] = 'W';
                        q.add(new Pair(newR, newC));
                    }
                }
            }
        }
    }

    // dfs
    public static void dfs(char[][] grid, int row, int col) {
        grid[row][col] = 'W';

        for (int dRow = -1; dRow <= 1; dRow++) {
            for (int dCol = -1; dCol <= 1; dCol++) {
                int newR = row + dRow;
                int newC = col + dCol;
                if (newR >= 0 && newR < grid.length && newC >= 0 && newC < grid[0].length && grid[newR][newC] == 'L') {
                    grid[newR][newC] = 'W';
                    dfs(grid, newR, newC);
                }
            }
        }
    }

    public static void main(String[] args) {
        char grid[][] = { { 'L', 'L', 'W', 'W', 'W' }, { 'W', 'L', 'W', 'W', 'L' }, { 'L', 'W', 'W', 'L', 'L' },
                { 'W', 'W', 'W', 'W', 'W' }, { 'L', 'W', 'L', 'L', 'W' } };
        System.out.println(countIsland(grid));
        // using both it'll give output 4
    }
}
