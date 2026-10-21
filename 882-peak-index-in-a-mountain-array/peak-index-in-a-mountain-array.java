class Solution {
    public int peakIndexInMountainArray(int[] arr) {
        int n=arr.length;
        int high=n-1;
        int low=0;

        while(low<high){
            int mid=low+ (high-low)/2;

            if(arr[mid+1]>arr[mid]){
                low=mid+1;
            }
            else high=mid;
        }
        return low;
    }
}