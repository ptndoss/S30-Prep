// Time Complexity - O(E + V) where Edge here is number of nodes - n*m. Over all time complexity is O(n*m)  
// Space Complexity - O(n*m) where n and m are the row and col of the given maze.  Space to store visited array

// Approach - 

class Solution {
    public boolean hasPath(int[][] maze, int[] start, int[] destination) {
        
        boolean[][] visited = new boolean[maze.length][maze[0].length];
        int[][] dirs = {{0,1},{1,0},{-1,0},{0,-1}};
        
        Queue<Edge> queue = new LinkedList<>();
        Edge startEdge = new Edge(start[0], start[1]);
        queue.add(startEdge);
        visited[start[0]][start[1]] = true;
        while(!queue.isEmpty()){
            Edge current = queue.poll(); // Get the current edge from the queue.
            
            //Is this current goal?
            if(current.x == destination[0] && current.y == destination[1] ){
                return true;
            }
            
            for(int[] dir: dirs){         // Traverse through the direction to see if there is any location were ball can be rolled
                //Check each adjacent directions
                int row = dir[0] + current.x;
                int col = dir[1] + current.y;
                
                //check if the newly calculated value reaches the wall?
                // Ball will roll untill it reaches wall or already visited edge
                while(isValidEdge(maze, row, col)){
                    // if this is valid move in SAME direction
                    //Untill it hits the wall i.e the condition fails
                    row = row + dir[0];
                    col = col + dir[1];
                    
                }
                // Currently the ball is at the position where it hits the wall. To roll in other direction take a step back in SAME direction
                row -= dir[0];
                col -= dir[1];
               
                //add to the que to start from this point later;
                //mark the position as visited when it stops.
                if(!visited[row][col]){
                     visited[row][col] = true;
                    queue.add(new Edge(row, col));
                }
            }   
        }
        return false;
    }
    
    private boolean isValidEdge(int[][] maze, int x, int y){
     
        if(x >= 0 && y >= 0 && x<maze.length && y < maze[0].length && maze[x][y]==0)
            return true;
            
        return false;
    }
    
    class Edge{
        int x;
        int y;
        public Edge(int x, int y){
            this.x = x;
            this.y = y;
        }
    }
}
