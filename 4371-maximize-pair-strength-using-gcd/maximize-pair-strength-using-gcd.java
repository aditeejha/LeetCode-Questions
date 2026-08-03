class Solution {
    int gcd(int a, int b){
        if(b==0) return a; 
        return gcd(b,a%b); 
    }
    public long maxPairStrength(int[] nums) {
        long ans=0; 
        for(int i=0; i<nums.length; i++){
            for(int j=i+1; j<nums.length; j++){
                long num=((long)nums[i]*(long)nums[j]); 
                long denm=gcd(nums[i], nums[j]); 
                denm*=denm; 
                ans=Math.max(ans, num/denm); 
            }
        }
        return ans; 
    }
}