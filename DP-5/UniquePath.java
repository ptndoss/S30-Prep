// Time Complexity - O(n*m)
// Space Complexity - O(n+m) to store the values in 2D array. This can be maintained in 1-D array with O(n) space.
class Solution {
    public int uniquePaths(int m, int n) {
        
        int[][] distinctPath = new int[m][n];
        
        for(int i= 0 ; i< m; i++){
            distinctPath[i][0] = 1; // Because there is only one way to move towards the first row
        }
        
        for(int i= 0 ; i< n; i++){
            distinctPath[0][i] = 1; // Because there is only one way to move towards the first column
        }
        
        //Robot can move right or down, so for position (1,1) robot can move from first position towards right and down, or Down and right there are 2 options
        //Summing up of options available in previous block and top block will give the steps used for current block.
        
        for(int i= 1; i<m;i++){
            for(int j= 1; j<n; j++){
               distinctPath[i][j] = distinctPath[i][j-1] + distinctPath[i-1][j];  
            }
        }
        return distinctPath[m-1][n-1];  //return value at the finish position.
    }
}
