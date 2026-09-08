// Time Complexity : O(m * n) => m - length of source & n - length of target
// Space Complexity : O(1) no additional space
// Did this code successfully run on Leetcode : Yes
// Any problem you faced while coding this : No


// Your code here along with comments explaining your approach
// Each char of source is validated against char at target.
// If there is a mismatch in char after parsing while source return -1
// if we can encounter subsequence increment count for every sequence and return count once all target char are checked.

class Solution {
    public int shortestWay(String source, String target) {
        if(source == null || source.length() ==0)
            return 0;
        
        // Sub sequence of Source = xyz is x,y,z,xy,xz,yz,xyz
        // We need to check if this subsequence can be used to form the target string
        int sCursor = 0, tCursor = 0;
        int count = 0;
        while(tCursor < target.length()){
            //if There is any new char in target which is not there in source 
            // eg source = abc and target = acdbc ==> d is new char loop shd fail when it encounters new character.
            
            int currPosOfTgt = tCursor;
            //If all the char in Source Matches with Target
            while(sCursor < source.length() && tCursor < target.length()){
                if(source.charAt(sCursor) == target.charAt(tCursor)){
                    sCursor++;
                    tCursor++;
                }else{
                    sCursor++;
                }
            }
            //After the loop if the target cursor remains the same there are no match for the char in target. So return -1;
            if(currPosOfTgt == tCursor){
                return -1;
            }
            count++;
            sCursor = 0;    //Start again to check for next subsequence validation;
            
        }
        return count;
    }
}
