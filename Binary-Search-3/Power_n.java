// Time Complexity : log(n)  --> 
// Space Complexity : O(1) no extra space used
// Did this code successfully run on Leetcode : Yes
// Any problem you faced while coding this : No

class Solution {
    public double myPow(double x, int n) {
        
        long longN = n;
        if(n<0){   // In case of (x)^-8. COnvert to 1/(x)^8 
            x = 1/x;  // take inverse of x
            longN= -1*longN; // change the negative number to positive 
        }
     return power(x,longN);
    }
    
    private double power(double x, long n){
        //base
        if(n == 0)
            return 1;
        if(n == 1)
            return x;
        //logic
        double val = power(x, n/2);
            if(n%2== 0){
                  return val*val;
             }else{
                 return x*val*val;
            }
    }
}
