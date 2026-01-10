class Solution {
    public int thirdMax(int[] nums) {
        Arrays.sort(nums);
        int n=nums.length;
        int largest=nums[n-1];
        int slargest;
        for(int i=n-2; i>=1; i--){
            if(nums[i]<largest){
                slargest=nums[i];
                if(nums[i-1]<slargest) return nums[i-1];
                else continue;
        
        }
        else continue;
        }
        return largest;
    }
}
