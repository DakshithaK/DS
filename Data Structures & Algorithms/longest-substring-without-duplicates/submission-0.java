class Solution {
    public int lengthOfLongestSubstring(String s) {
        int n=s.length();
        int res=0;
        for(int i=0;i<n;i++){
            Set <Character> ch= new HashSet<>();
            for(int j=i;j<n;j++){
                if(ch.contains(s.charAt(j))){
                    break;
                }
                ch.add(s.charAt(j));
            }
            res= Math.max(res, ch.size());
        }
        return res;
        
    }
}
