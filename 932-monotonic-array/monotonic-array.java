class Solution {
    public boolean isMonotonic(int[] nums) {
       int n=nums.length;
       int flag=0;
       int cnt=0;
       for(int i=0;i<n-1;i++){
        if(nums[i+1]<nums[i]){
            flag++;
        }
        if(nums[i+1]>nums[i]){
            cnt++;
        }
       }
       if(flag==0 || cnt==0)
       return true; 
       else
       return false;
    }
}