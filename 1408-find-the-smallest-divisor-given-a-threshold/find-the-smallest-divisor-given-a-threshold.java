class Solution {
    public int smallestDivisor(int[] nums, int threshold) {
        int maxi=0;
        for(int i=0; i<nums.length;i++){
            maxi=Math.max(nums[i],maxi);
        }
        int high=maxi;
        int low=1;
        int ans=-1;
        while(low<=high){
            int mid=low + (high - low) / 2;
            if(sumofD(nums,mid)<=threshold){
                ans=mid;
                high=mid-1;
            }
            else low=mid+1;
        }
        return ans;
    }
    public int sumofD(int[] nums, int mid){
        int sum=0;
        for(int i=0; i<nums.length; i++){
            sum += (nums[i] + mid - 1) / mid;

        }
        return sum;
    }
}