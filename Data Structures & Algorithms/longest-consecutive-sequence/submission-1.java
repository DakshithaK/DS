class Solution {
    public int longestConsecutive(int[] nums) {
        int res=0;
        Set<Integer> hs= new HashSet<>();
        for(int num:nums){
            hs.add(num);
        }
        for(int num:nums){
            int streak=0;
            int curr=num;
            while(hs.contains(curr)){
                streak++;
                curr++;
            }
            res=Math.max(res,streak);
        }
        
    return res;}
}
