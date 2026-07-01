class Solution {
    public int lengthOfLongestSubstring(String s) {
        int n=s.length();
        int res=0;
        int l=0;
        Map<Character, Integer> mp= new HashMap<>();
        for(int r=0;r<n;r++){
            if(mp.containsKey(s.charAt(r))){
                l=Math.max(l,mp.get(s.charAt(r))+1);
            }
            mp.put(s.charAt(r),r);
            res= Math.max(res, r-l+1);
        }
        return res;
        
    }
}
