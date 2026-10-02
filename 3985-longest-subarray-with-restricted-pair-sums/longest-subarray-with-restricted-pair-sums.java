class Solution {
    public int maxSubarray(int[] nums) {
        int[] freq=new int[501];
        int left=0;
        int ans=0;
        for(int right=0; right<nums.length; right++) {
            freq[nums[right]]++;
            while(isInvalid(freq)) {
                freq[nums[left]]--;
                left++;
            }
            ans=Math.max(ans, right-left+1);
        }
        return ans;
    }
    private boolean isInvalid(int[] freq) {
        for(int a=1; a<=500; a++){
            if(freq[a]==0){
                continue;
            }
            for(int b=a; b<=500; b++){
                if(freq[b]==0) continue;
                int c=a+b;
                if(c>500)break;
                if(freq[c]==0) {
                    continue;
                }
                if(a==b && freq[a]<2) {
                    continue;
                }
                return true;
            }
        }
        return false;
    }
}