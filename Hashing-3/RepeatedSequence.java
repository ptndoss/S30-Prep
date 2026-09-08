// TimeComplexity - O(N - L)
// Space Complexity - O(N - L)

class Solution {
    public List<String> findRepeatedDnaSequences(String s) {
       List<String> result = new ArrayList<String>();
        if(s == null || s.length()==0)
            return result;
        
        Set<String> visitedSequence = new HashSet<>(); 
        Set<String> rsultSet = new HashSet<>();
        int letter_Seq = 10, len = s.length();
        
        for(int i=0; i< len - letter_Seq + 1;i++){
            String currSeq = s.substring(i, i+letter_Seq);
            
            if(!visitedSequence.contains(currSeq))
                visitedSequence.add(currSeq);
            else if(!result.contains(currSeq))
                    rsultSet.add(currSeq);
        }
        return new ArrayList<>(rsultSet);
    }
}
