class Solution {
    public boolean backspaceCompare(String s, String t) {
        return stringprocess(s).equals(stringprocess(t));
    }
    public String stringprocess(String x){
        Stack<Character> st = new Stack<>();
        
        for(char i : x.toCharArray()){
            if(i == '#'){
                if(!st.isEmpty()){
                    st.pop();
                }
            }
            else{
                st.push(i);
            }
            
        }
        StringBuilder res = new StringBuilder();
            for(char c:st){
                res.append(c);
            }
        return res.toString();
       
    }
}