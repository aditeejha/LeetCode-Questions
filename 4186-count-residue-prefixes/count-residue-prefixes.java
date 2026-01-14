class Solution {
    public int residuePrefixes(String s) {
        int distinct=0;
        int count=0;
        boolean[] seen= new boolean[26];
        for(int i=0; i<s.length(); i++){
            int idx=s.charAt(i)-'a';
            if(seen[idx]==false){
                seen[idx]=true;
                distinct++;
            }
            int len=(i+1)%3;
            if(len==distinct){
                count++;
            }
        }
        return count;
    }
}