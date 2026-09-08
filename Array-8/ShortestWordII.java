//Time - O(n) --> Array List comparisio in hashmap
// Space -O(n)
class WordDistance {
     Map<String, List<Integer>> map = new HashMap<>();
        
    public WordDistance(String[] words) {
       
        for(int i=0; i<words.length; i++){
            if(!map.containsKey(words[i])){
                map.put(words[i], new ArrayList<>());
            }
            
            map.get(words[i]).add(i);
        }
    }
    
    public int shortest(String word1, String word2) {
        List<Integer> list1 = map.get(word1);
        List<Integer> list2 = map.get(word2);
        int shortDist = Integer.MAX_VALUE;
        int index1 = 0, index2 = 0;
        while(index1 < list1.size() && index2 < list2.size()){
            int val1 = list1.get(index1);
            int val2 = list2.get(index2);
            if(val1 < val2){
                shortDist = Math.min(shortDist, val2 - val1);
                index1++;
            }else{
                shortDist = Math.min(shortDist, val1 - val2);
                index2++;
            }
        }
        
        return shortDist;
    }
}

/**
 * Your WordDistance object will be instantiated and called as such:
 * WordDistance obj = new WordDistance(words);
 * int param_1 = obj.shortest(word1,word2);
 */
