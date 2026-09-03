class Solution {
    public List<List<Integer>> threeSum(int[] arr) {
        List<List<Integer>> ans = new ArrayList<>();

        int n=arr.length;
        Arrays.sort(arr);
        
       

        for(int i=0;i<n;i++){
            int sum=-arr[i];
             if(i > 0 && arr[i] == arr[i-1])
                continue;
            int left=i+1;
             int right=n-1;


while (left<right){
    int s=arr[right]+arr[left];
            if(sum==s){
                ArrayList<Integer> list=new ArrayList<>();
                list.add(arr[i]);
                list.add(arr[left]);
                list.add(arr[right]);
                ans.add(list);
                while(left < right && arr[left] == arr[left + 1])
                        left++;

                    while(left < right && arr[right] == arr[right - 1])
                        right--;
                left++;
                right--;
            }
            

           else  if(sum>s){ 
              
                    left++;
                
            }
           else {   
                
                    right--;
                }
            }}
return ans;
        }
    }
