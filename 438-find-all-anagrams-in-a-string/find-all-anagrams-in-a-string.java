class Solution {
    public List<Integer> findAnagrams(String s, String p) {
        ArrayList<Integer> list= new ArrayList<>();
        int n=s.length();
        int m= p.length();

        int []arr= new int [256];
        for(int i=0;i<m;i++){
            arr[p.charAt(i)]++;
        }
         int []brr= new int [256];

        int high=0;
        int low=0;
        while(high<n){
            brr[s.charAt(high)]++;

            if(high-low+1 > m){
                brr[s.charAt(low)]--;
                low++;
            }
            if(high-low+1==m){
                boolean same=true;

                for(int i=0;i<256;i++){
                    if(arr[i]!= brr[i]){ same=false;}
                }
                if(same==true)
             {   int index=low;
                list.add(low);}
            }
            high++;
        }
        return list;
    }
}