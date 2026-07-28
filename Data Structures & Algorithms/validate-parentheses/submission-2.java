class Solution {
    public boolean isValid(String s) {
        Stack <Character> ss= new Stack<>();
        Map<Character, Character> cc= new HashMap<>();
        cc.put(')','(');
        cc.put('}','{');
        cc.put(']','[');
        for(char c:s.toCharArray()){
            if(cc.containsKey(c)){
                if(!ss.isEmpty() && ss.peek()==cc.get(c)){
                    ss.pop();
                }
                else{
                    return false;
                }
            }
            else{
                ss.push(c);
            }
        }
        return ss.isEmpty();
        
    }
}
