class Solution {
    public int minEatingSpeed(int[] piles, int h) {
        int n=piles.length;
        int m=Arrays.stream(piles).max().getAsInt();

        int low=1;
        int high=m;

        while(low<high){
            int mid=low+(high-low)/2;
            int hours=0;

            for(int pile:piles){
                hours+=(int)Math.ceil((double)pile / mid);
            }
            if(hours>h){
                low=mid+1;
            }
            else high=mid;
        }
        return low;
    }
}