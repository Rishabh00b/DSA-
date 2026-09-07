class Solution {
    int next(int n){
        int sum=0;
        while(n>0){
            int digit=n%10;
            sum+=digit*digit;
            n/=10;

        }
        return sum;
    }
    public boolean isHappy(int n) {
        int fast=n;
        int slow=n;

        while(true){
            slow=next(slow);
            fast=next(next(fast));

            if (slow == 1) return true;
            if (slow == fast) return false;


        }
        
    }
}