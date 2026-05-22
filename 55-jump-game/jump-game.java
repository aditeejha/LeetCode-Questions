class Solution {
    public boolean canJump(int[] nums) {
       int maxInd=0;
       for(int i=0; i<nums.length; i++){
        if(i>maxInd) return false;
        int id=i+nums[i];
        maxInd=Math.max(id,maxInd);
       } 
       return true;
    }
}