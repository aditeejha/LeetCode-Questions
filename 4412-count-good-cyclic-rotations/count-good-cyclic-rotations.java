class Solution {
    public int countGoodRotations(int[] nums) {
        int n=nums.length;
        long sum1=0;
        long sum2=0;
        int l=0;
        int r=n/2;
        int cnt=0;
        for(int i=0; i<n/2; i++) sum1+=nums[i];
        for(int i=n/2; i<n; i++) sum2+=nums[i];
        if(sum1>sum2) cnt++;
        while(l<n-1){
            sum1=sum1-nums[l]+nums[r];
            sum2=sum2-nums[r]+nums[l];
            l++;
            r=(r+1)%n;
            if(sum1>sum2) cnt++;
        }
        return cnt;
    }
}