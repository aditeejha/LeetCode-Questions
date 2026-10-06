class Solution {
    public int minAddToMakeValid(String s) {
        int op=0, add=0;
        for(char ch : s.toCharArray()) {
            if(ch=='(') op++;
            else if (op>0) op--; 
            else add++;
        }
        return add+op;
    }
}