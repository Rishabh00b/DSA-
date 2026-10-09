class Solution {
    public String removeDuplicates(String s) {
        int n=s.length();
        if(n==0){return "";}

        Stack<Character>st=new Stack<>();

        st.push(s.charAt(0));
        for(int i=1;i<n;i++){

            if(!st.isEmpty() &&st.peek()==s.charAt(i)){
                st.pop();
                continue;
            }
            else st.push(s.charAt(i));
            

        }
        StringBuilder sb = new StringBuilder();

    for (char ch : st) {
    sb.append(ch);
    }

    return sb.toString();


       
    }
}