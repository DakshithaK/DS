class Solution {
    public boolean isAnagram(String s, String t) {
        char[] cc= new char[26];
        if(s.length()!=t.length()){
            return false;
        }
        for(int i=0;i<s.length();i++){
            cc[s.charAt(i)-'a']++;
            cc[t.charAt(i)-'a']--;
        }
        for(int i=0;i<26;i++){
            if(cc[i]>0){
                return false;
            }
        }
        return true;

    }
}
