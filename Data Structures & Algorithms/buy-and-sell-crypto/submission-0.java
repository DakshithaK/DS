class Solution {
    public int maxProfit(int[] prices) {
        int res=0;
        int n= prices.length;
        for(int i=0;i<n;i++){
            int buyP=prices[i];
            for(int j=i+1;j<n;j++){
                int sellP=prices[j];
                res= Math.max(res, sellP-buyP);
            }
        }
        return res;
        
    }
}
