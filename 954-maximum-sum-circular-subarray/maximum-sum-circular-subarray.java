class Solution {
    public int maxSubarraySumCircular(int[] arr) {

        int n = arr.length;

        int maxsum = arr[0];
        int minsum = arr[0];

        int currentmax = arr[0];
        int currentmin = arr[0];

        int total = arr[0];

        for (int i = 1; i < n; i++) {

            total += arr[i];

            currentmax = Math.max(currentmax + arr[i], arr[i]);
            maxsum = Math.max(maxsum, currentmax);

            currentmin = Math.min(currentmin + arr[i], arr[i]);
            minsum = Math.min(minsum, currentmin);
        }

        // All elements are negative
        if (maxsum < 0) {
            return maxsum;
        }

        return Math.max(maxsum, total - minsum);
    }
}