class Solution {
    public int numberOfSpecialChars(String word) {
        boolean upper[]=new boolean[26];
        boolean lower[]=new boolean[26];
        int count=0;
        for(int i=0; i<word.length(); i++) {
            char ch=word.charAt(i);
            if(Character.isUpperCase(ch)) {
                upper[ch-'A']=true;
            }else{
                lower[ch-'a']=true;
            }
        }
        for(int i=0; i<upper.length; i++){
            if(upper[i]==true && lower[i]==true) {
                count++;
            } 
        }
        return count; 
    }
}