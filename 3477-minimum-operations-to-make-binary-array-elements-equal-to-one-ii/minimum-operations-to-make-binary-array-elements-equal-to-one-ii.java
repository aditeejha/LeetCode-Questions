class Solution {
    public int minOperations(int[] nums) {
       int flips=0;
       int operations=0;
       int current=0;
       for(int i=0; i<nums.length; i++){
            if(flips%2 ==0) current=nums[i];
            else current=1-nums[i];
            if(current==0){
                operations++;
                flips++;
            }
        }
        return operations; 
    }
}