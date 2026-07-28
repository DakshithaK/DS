class Solution {
    public int evalRPN(String[] tokens) {
        Stack<Integer> ss= new Stack<>();
        for(String c: tokens){
            if(c.equals("+")){
                ss.push(ss.pop()+ss.pop());
            }
            else if(c.equals("-")){
                int a=ss.pop();
                int b=ss.pop();
                int r=b-a;
                ss.push(r);
            }
            else if(c.equals("*")){
                ss.push(ss.pop()*ss.pop());
            }
            else if(c.equals("/")){
                int a=ss.pop();
                int b=ss.pop();
                ss.push(b/a);
            }
            else{
                ss.push(Integer.parseInt(c));
            }
        }
        return ss.pop();
        
    }
}
