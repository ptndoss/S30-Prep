// Time Complexity : klog(n) 
// Space Complexity : O(1) no extra space used
// Did this code successfully run on Leetcode : Yes
// Any problem you faced while coding this : No

//Approach 
// Choose the window of k size.
// Set the low to 0 and high to possible start of window which can be n-k. From kth position one window is possible.
//Check if absolute difference of given value x and midle value is greater than absolute difference of x and mid+k'th value.If so, second half is the range of our window. If not first half is the range of our window so move the high to mid. 
class Solution {
    public List<Integer> findClosestElements(int[] arr, int k, int x) {
        List<Integer> result = new ArrayList<>();
        
        if(arr == null || k==0 )
            return result;
        
        int low = 0;
        int high = arr.length-k;
        
        while(low < high){
            int mid = low + (high - low)/2;
            if(Math.abs(x - arr[mid]) > Math.abs(x - arr[mid+k])){
                low = mid + 1;
            }else{
                high = mid;
            }
        }
        
        for(int i=0; i<k;i++){
            result.add(arr[low + i]);
        }
    return result;
    }
}
