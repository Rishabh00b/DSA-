class Solution {
    public int[] nextGreaterElements(int[] arr) {
        int n=arr.length;
        Stack<Integer>st=new Stack<>();
        int [] brr =new int [n];

       

        for(int j=2*n-1;j>=0;j--){
            int i=j%n;
           
           while(!st.isEmpty() && st.peek() <= arr[i]){
                st.pop();
            }
            if(st.isEmpty()) {
                brr[i]=-1;
                st.push(arr[i]);
            }
            else{  brr[i]=st.peek(); st.push(arr[i]);}


           }
            return brr;
        }
    }
