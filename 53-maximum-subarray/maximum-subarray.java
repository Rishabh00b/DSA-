class Solution {
    public int maxSubArray(int[] arr) {
        int n=arr.length;
        int max=arr[0];
        int sum=0;

        for(int i=0;i<n;i++){
            sum=Math.max(arr[i],sum+arr[i]);
            max=Math.max(sum,max);
        }
        return max;
    }
}