class Solution {
    long fun(int[] arr,int speed){
        long h=0;
        // int result=-1;

        for(int i=0;i<arr.length;i++){
            if(arr[i]%speed==0) h+=arr[i]/speed;
            else h+=(arr[i]/speed)+1;
        }
        return h;
    }
    public int minEatingSpeed(int[] piles, int h) {
        int n=piles.length;
        int result=-1;
        int low=1;
        int high=Arrays.stream(piles).max().getAsInt(); // max element of array

        while(low<=high){
            int mid=low+ (high-low)/2;
            
            long hour=fun(piles,mid);

            if(hour>h){
                low=mid+1;
            }
            else {
                result=mid;
                high=mid-1;
            }
        }
        return result;

    }
}