class Solution {
    public long countCommas(long n) {
        // long ans=0;
        // for(long i=1000; i<=n; i*=1000)
        //     ans+=n-i+1;
        // return ans;
        long ans=0;
        long start=1000;
        long commas=1;
        while(start<=n){
            long end=start*1000-1;
            long count=Math.min(n,end)-start+1;
            ans+=count*commas;
            start*=1000;
            commas++;
        }
        return ans;
    }
}