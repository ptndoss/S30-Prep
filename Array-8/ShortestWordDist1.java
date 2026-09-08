//Time - O(n)
//Space - O(1)
class Solution {
    public int shortestDistance(String[] words, String word1, String word2) {
            
        int wordIndex1 = -1;
        int wordIndex2 = -1;
        int shortDist = Integer.MAX_VALUE;
        for(int i=0; i<words.length; i++){
            
            if(words[i].equals(word1))
                wordIndex1=i;
            else if(words[i].equals(word2))
                wordIndex2=i;
            
            if(wordIndex1 != -1 && wordIndex2 != -1)
                shortDist = Math.min(shortDist, Math.abs(wordIndex1 - wordIndex2));
        }
        return shortDist;
    }
}
