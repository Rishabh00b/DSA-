class Solution {
    public boolean check(int[] window,int[] need){
        for(int i=0;i<256;i++){
            if(window[i]< need[i]){ return false;}

        }
        return true;
    }
    public String minWindow(String s, String t) {
        int m=s.length();
        int n=t.length();
        int result=Integer.MAX_VALUE;
        int len=0;
        int start=0;

        int low=0;
        int high=0;
        int [] need= new int [256];
        int [] window= new int [256];
        for(int i=0;i<n;i++){
            need[t.charAt(i)]++;
        }

        while(high<m){
           window[s.charAt(high)]++;
            while(check(window,need)){
                int length=high-low+1;
                if(result>length){
                   result = length;;
                    start=low;
                }
                window[s.charAt(low)]--;
                low++;

            }
high++;

        }
        if (result == Integer.MAX_VALUE) {
            return "";
        }
         return s.substring(start, start + result);
        
        

        
        
    }
}