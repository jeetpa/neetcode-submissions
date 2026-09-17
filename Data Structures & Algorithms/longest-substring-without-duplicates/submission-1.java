class Solution {
    public int lengthOfLongestSubstring(String s) {
        int a_counter = 0;
        int b_counter = 0;
        int max = 0;
        HashSet<Character> set = new HashSet();
        while(b_counter < s.length()){
            if(!set.contains(s.charAt(b_counter))){
                set.add(s.charAt(b_counter));
                b_counter++;
                max = Math.max(max,set.size());
            }
            else{
                set.remove(s.charAt(a_counter));
                a_counter++;
            }
        }
        return max;
    }
}
