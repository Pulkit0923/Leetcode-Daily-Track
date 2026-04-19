class Solution {
    public boolean isValid(String s) {
        Stack<Character> st = new Stack<>();
        int n = s.length();
        for(int i =0;i<n;i++){
           char x =  s.charAt(i);

           if(x == '(' || x== '[' || x=='{'){
            st.push(x);
           }
           else {
            if(st.size() ==0) return false;
            if(x==')' && st.peek()=='('){
                st.pop();
            }
            else if(x=='}' && st.peek()=='{'){
                st.pop();
            }
            else if(x==']' && st.peek()=='['){
                st.pop();
            }
            else return false; // here in this case else is connected to last if only
           }
        }
            if(st.size()>0) return false;
           else return true;
    }
}