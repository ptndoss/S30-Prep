## Find First and Last Position of Element in Sorted Array

// Time Complexity : O(log n)
// Space Complexity : O(1) There is no auxilary data structure used for space.
// Did this code successfully run on Leetcode : Yes
// Any problem you faced while coding this : Faced few problems in handling boundaries. Resolved them and its perfect now.


// Your code here along with comments explaining your approach
Binary search logic is used to discard half of elements which are lesser than the target. Solved this problem in 2 parse. 
One for First element and second parse is for last element.
 -  If mid value is the target, I check if the mid element is greater than previous then mid is the lowest target. Return the mid number


class Solution {
    
    
    public int[] searchRange(int[] nums, int target) {
        if(nums == null || nums.length == 0)
            return new int[] {-1, -1};
        if(nums[0] > target || nums[nums.length-1] < target)
            return new int[] {-1, -1};
        int first = getFirstOccurence(nums, target);
        int last = getLastOccurence(nums, target);
        return new int[] {first, last};
        
    }
    public int getFirstOccurence(int[] nums, int target){
            int low = 0;
            int high = nums.length;
            while(low <= high){
                int mid = low + (high - low)/2;
                if(nums[mid] == target){
                   if(mid ==0 || nums[mid] > nums[mid-1]){
                       return mid;
                   }else{
                       high = mid - 1; 
                   }
                }
                else if(nums[mid] < target){
                    low = mid+1;
                }else{
                    high = mid -1;
                }
                    
            }
            return -1;
        }
        
        
        private int getLastOccurence(int[] nums, int target){
            int low = 0;
            int high = nums.length;
            while(low <= high){
                int mid = low + (high - low)/2;
                if(nums[mid] == target){
                   if(mid ==nums.length-1 || nums[mid] < nums[mid+1]){
                       return mid;
                   }else{
                       low = mid + 1; 
                   }
                }
                else if(nums[mid] < target){
                    low = mid+1;
                }else{
                    high = mid -1;
                }
                    
            }
            return -1;
        }
}

=============================================Find Minimum in Rotated Sorted Array==========================================

// Time Complexity : O(log n)
// Space Complexity : O(1) There is no auxilary data structure used for space.
// Did this code successfully run on Leetcode : Yes
// Any problem you faced while coding this :

// Your code here along with comments explaining your approach
class Solution {
    public int findMin(int[] nums) {
        if(nums.length == 0 )
            return -1;
        if(nums.length == 1)
            return nums[0];
        
        //Binary Search approach
        // Sorted Rotated array will have previous element greated than current elemnt at rotated point.
        int low = 0;
        int high = nums.length-1;
        
        while(low < high){
            int mid = low + (high - low)/2;
            
            if(nums[mid] > nums[high]){
                low = mid + 1;
            }else{
                high = mid;
            }
        }
        return nums[low];
    }
}

===========================================Find Peak Element===================================================

// Time Complexity : O(log n)
// Space Complexity : O(1) There is no auxilary data structure used for space.
// Did this code successfully run on Leetcode : Yes
// Any problem you faced while coding this :

// Your code here along with comments explaining your approach

class Solution {
    public int findPeakElement(int[] nums) {
        if(nums.length ==0 )
            return -1;
        int low = 0;
        int high = nums.length-1;
        while(low <= high){
            int mid = low + (high - low)/2;
            
            if((mid == 0 || nums[mid] > nums[mid-1]) && (mid == nums.length - 1 || nums[mid] > nums[mid + 1] )){
                    return mid;               
            }else if(mid > 0 && nums[mid] < nums[mid-1]){ // To find peak always move to the side which has greater number
                high = mid - 1 ;
            }else{
                low = mid + 1;
            }
        
        }
               return -1;   
    }
}
