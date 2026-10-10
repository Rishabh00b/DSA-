class Solution {
    public String simplifyPath(String s) {
        // int n=s.length();
        String [] parts=s.split("/");
        Stack<String>st=new Stack<>();

        for(String part:parts){
             if(part.isEmpty() || part.equals(".")){
                continue;
            }
            if(part.equals("..")){
                if(!st.isEmpty()){
                    st.pop();
                }
            }
           
            else{
                st.push(part);
            }
        }
        StringBuilder sb=new StringBuilder();
        for(String a: st){
            sb.append('/').append(a);
        }
        return sb.length() == 0 ? "/" : sb.toString();
    }
}