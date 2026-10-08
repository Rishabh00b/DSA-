class Solution {
    public int[][] merge(int[][] arr) {
        int n=arr.length;
        List<int[]>ans=new ArrayList<>();
        Arrays.sort(arr, (a,b)->Integer.compare(a[0],b[0]));
        int start1=arr[0][0];
        int end1=arr[0][1];

        for(int i=1;i<n;i++){
            int start2=arr[i][0];
            int end2=arr[i][1];

            if(end1>=start2){
                start1=start1;
                end1=Math.max(end1,end2);
            }
            else{
                ans.add(new  int[] {start1,end1});

                start1=start2;
                end1=end2;
            }
            
        }
        ans.add(new int[]{start1, end1});

        return ans.toArray(new int[ans.size()][]);

    }
}