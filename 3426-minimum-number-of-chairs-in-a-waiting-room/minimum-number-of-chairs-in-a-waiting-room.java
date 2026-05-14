class Solution {
    public int minimumChairs(String s) {
      int ch=0;
      int max=0;
      for(int i=0; i<s.length(); i++){
        if(s.charAt(i)=='E') ch++;
        else if(s.charAt(i)=='L') ch--;
        max=Math.max(ch,max);
      } 
      return max; 
    }
}