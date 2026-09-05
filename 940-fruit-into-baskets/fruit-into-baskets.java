class Solution {
    public int totalFruit(int[] arr) {
        int n=arr.length;
        int max=-1;
        int low=0;
        int high=0;
        HashMap<Integer,Integer>hm=new HashMap<>();
        while(high<n){
            hm.put(arr[high],hm.getOrDefault(arr[high], 0)+1);
            high++;

            if(hm.size()>2){
                

                if (hm.get(arr[low]) == 1) {
                    hm.remove(arr[low]);
                } else {
                    hm.put(arr[low], hm.get(arr[low]) - 1);
                }

                low++;

            }

            if(hm.size()<=2){
                int len=high-low;
                max=Math.max(len,max);
            }
        }
        return max;
        
    }
}