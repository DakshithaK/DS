class Solution {
    public int[] twoSum(int[] nums, int target) {
        HashMap<Integer, Integer> previousSeen= new HashMap<>();
        for(int i=0;i<nums.length;i++){
            int diff= target-nums[i];
            if(previousSeen.containsKey(diff)){
                return new int [] {previousSeen.get(diff),i};

            }
            previousSeen.put(nums[i],i);
        }
        return new int[] {-1,-1};
        
    }
}
