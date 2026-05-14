class Solution {
    public boolean isGood(int[] nums) {
        Arrays.sort(nums);
        int[] hash=new int[nums[nums.length-1]+1];
        for(int i=0; i<nums.length; i++){
            hash[nums[i]]++;
        }
        for(int i=1; i<=hash.length-2; i++){
            if(hash[i]!=1) return false;
        }
        if(hash[hash.length-1]!=2) return false;
        if (nums.length!=nums[nums.length-1]+1) return false;
        return true;
    }
}