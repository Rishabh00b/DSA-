class Solution {
    public int maxNumberOfBalloons(String s) {
        int n=s.length();
        HashMap<Character,Integer>hm=new HashMap<>();

        for(int i=0;i<n;i++){
            hm.put(s.charAt(i),hm.getOrDefault(s.charAt(i),0)+1);
        }

        String a="balloon";
        int count=0;
        boolean ans=true;
        while(ans){
            for(int i=0;i<a.length();i++){
                if(hm.containsKey(a.charAt(i))){
                    if(hm.get(a.charAt(i))==1){ hm.remove(a.charAt(i));}
                   else {hm.put(a.charAt(i),hm.get(a.charAt(i))-1);}
                }
                else{ans=false;}
            }
            count++;
        }
        return count-1;
        
    }
}