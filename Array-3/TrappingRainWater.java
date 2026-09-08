// Time - O(n)
// Space - O(n)
// Approach 
// Get the MAX hight from Left
// Get the MAX hight in right
// From Max Hight from Left to Right exclude the building height and calculate the water content
class Solution {
    public int trap(int[] height) {
        int totalWater = 0;
        if(height == null || height.length ==0)
            return totalWater;
        int n = height.length;
        int[] leftHighest =new int[n];
        
        leftHighest[0] = height[0];
        for(int i = 1; i<height.length; i++){
            leftHighest[i] = Math.max(leftHighest[i-1], height[i]);
        }
        
        int rightHighest = height[height.length-1];
        for(int i = height.length-2; i>=0 ; i--){
            rightHighest = Math.max(rightHighest, height[i]);
            totalWater += Math.min(leftHighest[i], rightHighest) - height[i];
            
            if(totalWater < 0 )
                totalWater = 0;
                
        }
        return totalWater;
    }
}
