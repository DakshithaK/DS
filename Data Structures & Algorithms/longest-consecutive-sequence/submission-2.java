class Solution {
    public int longestConsecutive(int[] nums) {
        int longest= 0;
        Set<Integer> hs= new HashSet<>();
        for(int n:nums){
            hs.add(n);
        }
        for(int n:hs){
            if(!hs.contains(n-1)){
                int streak=1;
            
            while(hs.contains(n + streak)){
                streak++;
            }
            longest=Math.max(longest,streak);}

        }
        
    return longest;}
}
