// Time Complexity - O(n)
// Space Complexity - O(1)
    
class Solution {
    public int minDominoRotations(int[] A, int[] B) {
        int validateFirstDomino = validateFlip(A, B, A[0]);
        
        if(validateFirstDomino == -1)  //Check for Second value in First Domino
            return validateFlip(A, B, B[0]);
        else
            return validateFirstDomino;                  //
        
    }
    
    private int validateFlip(int[] A, int[] B, int x){
        int flip_top=0, flip_bottom = 0;
        for(int i=0; i<A.length; i++){
            if(A[i] != x && B[i] != x)  // Value doesnt match to perform flip
                return -1;
            else if(A[i] != x)          // Value doesnt match with Top but it matches bottom because previous condition is not satisfied.
                flip_bottom++;
            else if(B[i] != x)
                flip_top++;
        }
        
        return Math.min(flip_top,flip_bottom);
    }
}
