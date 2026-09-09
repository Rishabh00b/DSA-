class Solution {
    public int maxProduct(int[] a) {
        int n=a.length;
        int maxproduct=a[0];
        int minproduct=a[0];
        int result=a[0];

        for(int i=1;i<n;i++){

            int current=a[i];
            int v1=maxproduct*a[i];
            int v2=minproduct*a[i];

            maxproduct=Math.max(current,Math.max(v1,v2));
            minproduct=Math.min(current,Math.min(v1,v2));
            result=Math.max(result,Math.max(maxproduct,minproduct));

        }
        return result;

        
    }
}