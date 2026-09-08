class Solution {
    public int findDuplicate(int[] arr) {
        int slow=0;
        int fast=0;

        while(true){
            slow=arr[slow];
            fast=arr[arr[fast]];

            if(slow== fast){
                int temp=0;
                while(slow!=temp){
                    temp=arr[temp];
                    slow=arr[slow];
                }
                return slow;
            }
        }
        // return -1;
    }
}