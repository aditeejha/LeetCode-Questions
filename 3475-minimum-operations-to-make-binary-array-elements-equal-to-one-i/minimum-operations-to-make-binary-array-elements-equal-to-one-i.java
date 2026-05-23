class Solution {
    public int minOperations(int[] nums) {
        int cnt=0;
        int i=0;
        while(i<nums.length-2){
            if(nums[i]==0){
                cnt++;
                nums[i]=1;
                if(nums[i+1]==0){
                    nums[i+1]=1;
                }
                else{
                    nums[i+1]=0;
                }
                if(nums[i+2]==0){
                    nums[i+2]=1;
                }
                else{
                    nums[i+2]=0;
                }
                i++;
            }
            else i++;
        }
        if(nums[nums.length-1]==0 || nums[nums.length-2]==0) return -1;
        else return cnt;
    }
}