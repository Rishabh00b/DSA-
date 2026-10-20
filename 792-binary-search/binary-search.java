class Solution {
    public int search(int[] arr, int target) {
        int n=arr.length;
        int high=n-1;
        int low=0;

        while(low<=high){
            int mid=low+(high-low)/2;

            if(target==arr[mid]){return mid;}

            else if(target>arr[mid]){low=mid+1;}

            else high=mid-1;


        }
            return -1;


    }}
    
