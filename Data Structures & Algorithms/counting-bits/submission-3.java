class Solution {
    public int[] countBits(int n) {
        int[] output= new int[n+1];
        for(int i=1;i<n+1;i++){
            int res=0;
            int j=i;
            while(j!=0){
                j=j & (j-1);
                res++;
            }
            output[i]= res;
        }
        return output;
        
    }
}
