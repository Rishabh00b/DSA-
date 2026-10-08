class Solution {
    public int[][] insert(int[][] intervals, int[] arr) {
        List<int[]>ans=new ArrayList<>();
        int n=intervals.length;
        boolean inserted = false;
        
        for(int i=0;i<n;i++){
            if(intervals[i][0]>arr[0] && inserted==false){
                    ans.add(new int[]{arr[0],arr[1]});
                    // continue;
                     inserted = true;
            }
            ans.add(new int[]{intervals[i][0],intervals[i][1]});
        }
        if(!inserted){
            ans.add(arr);
        }
        ////////////////////////////////

        List<int[]>result=new ArrayList<>();
        int start1=ans.get(0)[0];
        int end1=ans.get(0)[1];

        for(int i=1;i<n+1;i++){
            int start2=ans.get(i)[0];
            int end2=ans.get(i)[1];

            if(end1>=start2){
                start1=start1;
                end1=Math.max(end1,end2);
            }
            else{
                result.add(new int[] {start1,end1});
                start1=start2;
                end1=end2;
            }
        }
        result.add(new int[] {start1,end1});
         return result.toArray(new int[result.size()][]);


    }
}