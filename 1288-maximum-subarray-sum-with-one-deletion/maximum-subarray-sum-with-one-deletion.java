class Solution {
    public int maximumSum(int[] arr) {
        int n= arr.length;
       int onedelete = 0;
        int nodelete = arr[0];
        int result = arr[0];

        for(int i=1;i<n;i++){
             int oldnodelete = nodelete;
            nodelete=Math.max(nodelete+arr[i],arr[i]);
            onedelete=Math.max(onedelete+arr[i],oldnodelete);
            result=Math.max(result,Math.max(onedelete,nodelete));
        }
        return result;

    }
}