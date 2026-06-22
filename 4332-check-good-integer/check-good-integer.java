class Solution {
    public boolean checkGoodInteger(int n) {
        int digitsum=0;
        int sqsum=0;
        while(n>0){
            int ld=n%10;
            digitsum+=ld;
            sqsum+=square(ld);
            n=n/10;
        }
        if(sqsum-digitsum>=50) return true;
        return false;
    }
    public int square(int x){
        return x*x;
    }
}