class Solution {
    public int threeSumClosest(int[] arr, int target) {
        int n=arr.length;
        int sum=0;
        Arrays.sort(arr);

        int d= Integer.MAX_VALUE;
        for(int i=0;i<n;i++){
            // int sum=-arr[i];
            int left=i+1;
            int right=n-1;
            while(left<right){
                int s = arr[i]+ arr[left] + arr[right];
                   
                     int diff = Math.abs(target - s);

                if(diff < d) {
                    d = diff;
                    sum = s;
                }
                   if(s < target)
    left++;
else if(s > target)
    right--;
else
    return s;
                
                }
            }
            return sum;
        }
    }
