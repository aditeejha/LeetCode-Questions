class Solution {
    public boolean isPalindrome(int x) {
        int rev=0;
        int q=x;
        while (q>0){
            int ld=q%10;
            rev=rev*10+ld;
            q=q/10;
        }
        if(x==rev){
            return true;
        }
        return false;
    }
}