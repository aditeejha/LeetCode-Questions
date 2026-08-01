class Solution {
    public int countValidPrefixes(String s) {
       int zero=0;
       int one=0;
       int res=0;
       for(char ch: s.toCharArray()){
        if(ch=='0') zero++;
        if(ch=='1') one++;
        if(Math.abs(one-zero)<=1) res++;
       } 
       return res;
    }
}