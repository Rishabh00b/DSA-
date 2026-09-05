class Solution {
    public int lengthOfLongestSubstring(String s) {
        int n=s.length();
        int high=0;
        int low=0;
        int max=0;
        HashMap<Character,Integer>hm=new HashMap<>();
        while(high<n){
            hm.put(s.charAt(high),hm.getOrDefault(s.charAt(high),0)+1);
            high++;
            int k=high-low;
            while(hm.size()<k){
                if(hm.get(s.charAt(low))==1){
                    hm.remove(s.charAt(low));
                }
                else hm.put(s.charAt(low),hm.get(s.charAt(low))-1);
                low++;
                k=high-low;
            }
            int len=high-low;
            max=Math.max(len,max);
        } return max;
    }
}