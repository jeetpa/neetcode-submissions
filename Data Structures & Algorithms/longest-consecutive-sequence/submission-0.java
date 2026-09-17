class Solution {
   public int longestConsecutive(int[] nums) {
      if(nums.length == 0) return 0;
      HashSet<Integer> set = new HashSet<>();
      for(int num: nums){
        set.add(num);
      }
      int count = 1;
      for(int num : nums){
        int tempCount =1;
        if(!set.contains(num-1)){
            while(set.contains(num+1)){
                tempCount ++;
                num++;
            }
        }
        count = Math.max(count,tempCount);
      }
      return count;
    }
}