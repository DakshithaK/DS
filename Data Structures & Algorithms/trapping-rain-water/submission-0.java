class Solution {
    public int trap(int[] height) {
        int n=height.length;
        int res=0;
        for(int i=0;i<n;i++){
            int leftmax= height[i];
            int rightmax= height[i];
            for(int j=0;j<i;j++){
                leftmax= Math.max(leftmax,height[j]);
            }
            for(int j=i+1;j<n;j++){
                rightmax= Math.max(rightmax,height[j]);
            }
            res= res+ Math.min(leftmax, rightmax)-height[i];
        }
        return res;
        
    }
}
