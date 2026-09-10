class Solution {
    public int maxSubarraySumCircular(int[] arr) {

        int total = 0;

        int currentMax = 0;
        int maxSum = Integer.MIN_VALUE;

        int currentMin = 0;
        int minSum = Integer.MAX_VALUE;

        for (int x : arr) {

            currentMax = Math.max(x, currentMax + x);
            maxSum = Math.max(maxSum, currentMax);

            currentMin = Math.min(x, currentMin + x);
            minSum = Math.min(minSum, currentMin);

            total += x;
        }

       
        if (maxSum < 0) {
            return maxSum;
        }

      
        return Math.max(maxSum, total - minSum);
    }
}