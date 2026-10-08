class Solution {
    public int[][] intervalIntersection(int[][] fl, int[][] sl) {
        int n=fl.length;
        int m=sl.length;

    List<int[]>ans=new ArrayList<>();

       int i=0;
       int j=0;

        while(i<n && j<m){
         int s1=fl[i][0];
        int e1=fl[i][1];

        int s2=sl[j][0];
        int e2=sl[j][1];

        if(s2<=e1 && s1<=e2){
            int start=Math.max(s1,s2);
            int end=Math.min(e1,e2);
            ans.add(new int[]{start,end});

        }
        

        if (e1 < e2) {
            i++;
}
    else {
    j++;
}

        }
        return ans.toArray(new int[ans.size()][]);
    }
}