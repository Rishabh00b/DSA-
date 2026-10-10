class Solution {
    public String removeKdigits(String s, int k) {
        int n= s.length();
        Stack<Character>st=new Stack<>();



        for(int i=0;i<n;i++){

            while(!st.isEmpty() && k>0 && st.peek()>s.charAt(i)){
                st.pop();
                k--;

            }

         

            st.push(s.charAt(i));
        }
           while(!st.isEmpty() && k>0){
                st.pop();k--;
            }
            StringBuilder sb=new StringBuilder();
            for(char a:st){
                sb.append(a);
            }

            int i=0;
            while(i<sb.length() && sb.charAt(i)=='0'){
                i++;
            }
            if (i == sb.length()) {
                 return "0";
}

            return sb.substring(i);
    }
}