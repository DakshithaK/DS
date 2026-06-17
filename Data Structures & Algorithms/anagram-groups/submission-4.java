class Solution {
    public List<List<String>> groupAnagrams(String[] strs) {
        Map<String,List<String>> st= new HashMap<>();
        for(String s: strs){
            int [] count= new int[26];
            for(char c: s.toCharArray()){
                count[c-'a']++;
            }
            String ss= Arrays.toString(count);
            st.putIfAbsent(ss, new ArrayList<>());
            st.get(ss).add(s);
        }
        return new ArrayList<>(st.values());
        
    }
}
