class Solution {
    public int findMaxConsecutiveOnes(int[] nums) {
        int count=0;
        int cns1=0;
        for(int i=0; i<nums.length; i++){
            if(nums[i]==0){                
                count=0;
            }
            if(nums[i]==1){
                count++;
                cns1=Math.max(cns1,count);
            }
            
        }
        return cns1;
    }
}