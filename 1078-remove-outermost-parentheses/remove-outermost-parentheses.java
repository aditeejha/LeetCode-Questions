class Solution {
    public String removeOuterParentheses(String s) {
        String sb="";
        int cnt=0;
        int n=s.length();
        for(int i=0; i<n; i++){
            if(s.charAt(i)=='(') {
                if(cnt>0) sb+='(';
                cnt++;
            }
            else if(s.charAt(i)== ')') {
                cnt--;
                if(cnt>0) sb+=')';
            }
        }
        return sb;
    }
}