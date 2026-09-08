// Time Complexity - O(m*n)
// Time Complexity - O(m*n)

//Approach - 
Base case
[1] --> minimal square with size 1.
[0] --> minimal square with size 0.
//From position INPUT(1,1),  Construct the square top down by checking Top, left and diagonaly up. If the minimum side around them is 1 then add one to get the size of bigger square. 

class Solution {
    public int maximalSquare(char[][] matrix) {
        if(matrix == null || matrix.length == 0|| matrix[0].length == 0)
            return 0;
        
        int n = matrix.length;
        int m = matrix[0].length;
        int[][] sideOfSquare = new int[n][m];  //Dp matrix
        int max_len = Integer.MIN_VALUE;
      
        
        for(int i=0; i< n; i++){
                sideOfSquare[i][0] = matrix[i][0] =='0' ? 0 : 1;
                if(sideOfSquare[i][0] == 1)
                    max_len = 1;
            }
        
      for(int i=0; i< m; i++){
                sideOfSquare[0][i] = matrix[0][i] =='0' ? 0 : 1;
                if(sideOfSquare[0][i] == 1)
                    max_len = 1;      
      }

    for(int i =1; i< n; i++){
        for(int j =1; j< m; j++){
            if(matrix[i][j] == '1'){
                sideOfSquare[i][j] = Math.min(sideOfSquare[i-1][j], Math.min(sideOfSquare[i][j-1], sideOfSquare[i-1][j-1])) + 1;
                max_len = Math.max(max_len, sideOfSquare[i][j]);
            }else{
                sideOfSquare[i][j] = 0;   
            }
            
        }
    }
        if(max_len == Integer.MIN_VALUE)
            return 0;
        
        return max_len * max_len;
  }
}
