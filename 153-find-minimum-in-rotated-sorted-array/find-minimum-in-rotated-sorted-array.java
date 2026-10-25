class Solution {
    public int findMin(int[] arr) {
        int n=arr.length;
        int res=-1;
        int high=n-1;
        int low=0;

        while(low<=high){
            int mid=low+(high-low)/2;
            if(arr[mid]>arr[n-1]){
                low=mid+1;
            }
            else { res=mid; 
            high=mid-1;}
        }
        return arr[res];
        
    }
}