class Solution {
    Set<String> visited  = new HashSet<>();
    public int numIslands(char[][] grid) {
            int count = 0;
        for(int i = 0 ; i < grid.length; i++)
        {
            for(int j = 0 ; j < grid[i].length; j++)
            {
                if(exploreIsland(grid,i, j))
                {
                    count++;
                }
            }
        }
        return count;
    }

    public boolean exploreIsland(char[][] grid, int i, int j)
    {
        if(i < 0 || i >= grid.length || j <  0 || j >= grid[i].length) return false;
        if(grid[i][j] == '0') return false;

        if(!visited.add(i + "," + j)) return false;
     
        exploreIsland(grid, i+1, j);
        exploreIsland(grid, i-1, j);
        exploreIsland(grid, i, j+1);
        exploreIsland(grid, i, j-1);

        return true;

    }
}


// class Solution {
//      private static final int[][] DIRECTIONS = {
//         {-1, 0}, // up
//         {1, 0},  // down
//         {0, -1}, // left
//         {0, 1}   // right
//     };
    
//     public int numIslands(char[][] grid) {
//         if (grid == null || grid.length == 0) {
//             return 0;
//         }

//         int numIslands = 0; // Counter for the number of islands.
//         int rows = grid.length;
//         int cols = grid[0].length;
        
//         for (int i = 0; i < rows; i++) {
//             for (int j = 0; j < cols; j++) {
//                 if (grid[i][j] == '1') { // Land cell found.
//                     numIslands++;
//                     dfs(grid, i, j); // Start BFS from this cell.

//                     // bfs(grid, i, j); // Start BFS from this cell.
//                 }
//             }
//         }
        
//         return numIslands; // Return the total count of islands.
//     }


//     private void dfs(char[][] grid, int i, int j)
//     {
//         if(i < 0 || j < 0 || i >= grid.length || j >= grid[i].length || grid[i][j] == '0') return;
//         grid[i][j] = '0';

//         dfs(grid, i+1, j);
//         dfs(grid, i-1, j);
//         dfs(grid, i, j+1);
//         dfs(grid, i, j-1);

//     }

//     private void bfs(char[][] grid, int row, int col) {
//         Queue<int[]> queue = new LinkedList<>();
//         queue.offer(new int[]{row, col}); // Start BFS with the initial land cell.
//         grid[row][col] = '0'; // Mark this cell as visited by turning it into water.
        
//         while (!queue.isEmpty()) {
//             int[] current = queue.poll();
//             int currRow = current[0];
//             int currCol = current[1];
            
//             for (int[] direction : DIRECTIONS) {
//                 int newRow = currRow + direction[0];
//                 int newCol = currCol + direction[1];
                
//                 // Check if the new position is within the grid and is a land cell.
//                 if (newRow >= 0 && newRow < grid.length && 
//                     newCol >= 0 && newCol < grid[0].length && 
//                     grid[newRow][newCol] == '1') {
//                     queue.offer(new int[]{newRow, newCol}); // Add new land cell to queue.
//                     grid[newRow][newCol] = '0'; // Mark as visited.
//                 }
//             }
//         }
//     }
// }