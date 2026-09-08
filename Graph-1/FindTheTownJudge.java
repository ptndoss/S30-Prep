// Time Complexity - O(n) traverse through the array to get the inward and outward counts.
// Time Complexity - O(n) Stores 2 array to maintain the count
class Solution {
    public int findJudge(int N, int[][] trust) {
        
        if(N== 0 )
            return -1;
        
        int[] votes = new int[N+1]; //N starts be from 1 till 1000 so maitain size as N+1;
        int[] voted = new int[N+1];
        
        for(int i=0; i<trust.length; i++){
            int myVote = trust[i][1]; // from others 
            int iVoted = trust[i][0]; // I voted, self vote
            votes[myVote]++; 
            voted[iVoted]++; 
        }
        
        for(int i=1; i<=N; i++){  // Votes starts from 1 
            // System.out.println(inward[i] + " " + outward[i]);
            if(votes[i] == N-1 && voted[i] == 0)   // Votes judge get should be N - judge vote and Judg's vote should be 0
                return i;
        }
        return -1;
    }
}
