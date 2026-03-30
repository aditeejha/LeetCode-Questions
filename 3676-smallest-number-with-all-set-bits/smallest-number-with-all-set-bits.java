class Solution {
    public int smallestNumber(int n) {
       int i=n;
       if((i & (i-1))==0) i++;
       while((i & (i-1)) !=0){
        i++;
       } 
       return i-1;
    }
}