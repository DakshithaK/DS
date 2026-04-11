class Solution {
    public int[] topKFrequent(int[] nums, int k) {
        Map<Integer,Integer> hp= new HashMap<>();
        for(int num:nums){
            hp.put(num,hp.getOrDefault(num,0)+1);
        }
        List<Integer> [] freq= new List[nums.length+1];
        for(int i=0;i<freq.length;i++){
            freq[i]=new ArrayList<>();
        }
        for(Map.Entry<Integer,Integer> entry:hp.entrySet()){
            freq[entry.getValue()].add(entry.getKey());}
            int []res= new int[k];
            int index=0;
            for(int i=freq.length-1;i>0 &&index<k;i--){
                for(int n:freq[i]){
                    res[index++]=n;
                    if(index==k){
                        return res;
                    }
                }


            }
            return res;
        
    }
}
