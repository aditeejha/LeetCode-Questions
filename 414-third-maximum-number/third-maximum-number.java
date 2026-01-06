class Solution {
    public int thirdMax(int[] nums) {
       int n=nums.length;
       Arrays.sort(nums);
       int ans=nums[n-1];
       for(int i=n-2; i>=1; i--){
           int j=i-1;
           if(nums[i]<ans){
            if(nums[i-1]<nums[i]){
                return nums[j];
            }
            else{
             continue;
            }           
           }
           else{
            continue;
           }
       }
       return ans;
    }
}