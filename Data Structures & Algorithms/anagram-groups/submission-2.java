class Solution {
   public static List<List<String>> groupAnagrams(String[] strs) {
       HashMap<String,List<String>> map = new HashMap<>();
       for(String word : strs){
           char [] ch = word.toCharArray();
           Arrays.sort(ch);
           String sortedWord = String.valueOf(ch);
           if(!map.containsKey(sortedWord)){
               map.put(sortedWord,new ArrayList<>());
           }
           map.get(sortedWord).add(word);
       }
       return new ArrayList<>(map.values());
    }
}
