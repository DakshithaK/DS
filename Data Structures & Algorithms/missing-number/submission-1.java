class Solution {
    public int missingNumber(int[] nums) {
        int n= nums.length;
        int res=n;
        int r=n;
        for(int i=0;i<r;i++){
            res= res^i^nums[i];

        }
        return res;
        
    }
}
