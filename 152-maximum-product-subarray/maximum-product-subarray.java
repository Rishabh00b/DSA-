class Solution {
    public int maxProduct(int[] arr) {
        int n=arr.length;
        int minproduct=arr[0];
        int maxproduct=arr[0];
        int result=arr[0];
        for(int i=1;i<n;i++){
            int current =arr[i];
         int v1= maxproduct*arr[i];
         int v2=minproduct*arr[i];

          maxproduct=Math.max(current,Math.max(v1,v2));
          minproduct=Math.min(current,Math.min(v1,v2));
           result=Math.max(result,Math.max(maxproduct,minproduct));
          

        }
       
        return result;



    }
}