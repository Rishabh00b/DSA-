class Solution {
    public int maxAbsoluteSum(int[] a) {
        int n=a.length;
        int maxsum=a[0];
        int minsum=a[0];
        int sum=a[0];
        int result=a[0];
        result=Math.max(result,Math.max(Math.abs(maxsum),Math.abs(minsum)));;

        for(int i=1;i<n;i++){
            int current =a[i];
            sum=sum+a[i];
            maxsum=Math.max(a[i],maxsum+a[i]);
            minsum=Math.min(a[i],minsum+a[i]);

            result=Math.max(result,Math.max(Math.abs(maxsum),Math.abs(minsum)));
        }
        return result;

        
    }
}