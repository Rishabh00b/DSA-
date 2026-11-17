class Solution {
    public boolean isPalindrome(int x) {
        if (x < 0) {
            return false;
        }

        int[] arr = new int[100];
        int i = 0;

        while (x > 0) {
            int digit = x % 10;
            arr[i] = digit;
            x /= 10;
            i++;
        }

        for (int j = 0; j < i / 2; j++) {
            if (arr[j] != arr[i - 1 - j]) {
                return false;
            }
        }

        return true;
    }
}