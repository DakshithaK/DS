class Solution {
    public List<List<String>> groupAnagrams(String[] strs) {
        Map<String, List<String>> str= new HashMap<>();
        for(String st: strs){
            char[] ch= st.toCharArray();
            Arrays.sort(ch);
            String s= new String(ch);
            str.putIfAbsent(s, new ArrayList<>());
            str.get(s).add(st);
        }
        return new ArrayList<>(str.values());

        
    }
}
