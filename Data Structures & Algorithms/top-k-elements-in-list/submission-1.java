class Solution {
    public int[] topKFrequent(int[] nums, int k) {
        int [] res = new int [k];
        HashMap<Integer,Integer> map = new HashMap<>();
        for(int i =0;i<nums.length;i++){
            if(map.containsKey(nums[i])){
                map.put(nums[i],map.get(nums[i]) +1);
            }
            else{
                map.put(nums[i],1);
            }
        }
        PriorityQueue<Integer> freqAll = new PriorityQueue<>((a,b) ->
        map.get(b) - map.get(a));
       freqAll.addAll(map.keySet());
        for(int i=0;i<k;i++){
            res[i] = freqAll.poll();
        }
        return res;
    }
}
