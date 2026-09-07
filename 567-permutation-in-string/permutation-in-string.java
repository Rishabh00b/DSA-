class Solution {
    public boolean checkInclusion(String s1, String s2) {
        int n=s1.length();
        int m=s2.length();

        int[] arr=new int [256];
        for(int i=0;i<n;i++){
            arr[s1.charAt(i)]++;
        }
        int [] window=new int[256];

        int low=0;
        int high=0;

        while(high<m){
            window[s2.charAt(high)]++;
            int len=high-low+1;
            if(len > n ){
                window[s2.charAt(low)]--;
                low++;
            }

            if(high-low+1==n){
                boolean same=true;
                for(int i=0;i<256;i++){
                    if(arr[i]!=window[i])
                  {  same = false;
                    break;}
                }
                if(same){return true;}

            }
            
              high++;
        }
        return false;
      


    }
}