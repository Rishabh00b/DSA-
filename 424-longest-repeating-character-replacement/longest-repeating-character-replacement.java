class Solution {
        int find(int[] a) {
        int maxc = -1;

        for (int i = 0; i < 256; i++) {
            maxc = Math.max(maxc, a[i]);
        }

        return maxc;
    }

    public int characterReplacement(String s, int k) {
        int n=s.length();
        int [] arr= new int[256];

       int  high=0;
       int  low=0;
       int  result=0;
         while(high<n){
            arr[s.charAt(high)]++;
            int maxf= find(arr);
            int len=high-low+1;
            int diff= len-maxf;

while(diff>k){
    arr[s.charAt(low)]--;
    low++;
    maxf= find(arr);
    len=high-low+1;
    diff= len-maxf;

}
        len = high - low + 1;
            result = Math.max(result, len);

            high++;

         }
         return result;
    }
}