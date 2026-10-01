class Solution {
    public int subarraysDivByK(int[] a, int k) {
        int n= a.length;
        int ans=0;
        int sum=0;
        HashMap<Integer,Integer>hm=new HashMap<>();
hm.put(0,1);
        for(int i=0;i<n;i++){
            sum+=a[i];
            int rem=sum%k;
            if(sum%k<0){
                rem=rem+k;
            }

            if(hm.containsKey(rem)){
                ans+=hm.get(rem);
            }

            hm.put(rem, hm.getOrDefault(rem,0)+1);
        }
        return ans;
    }
}