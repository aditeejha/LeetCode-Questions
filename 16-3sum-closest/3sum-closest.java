class Solution {
    public int threeSumClosest(int[] nums, int target) {
        Arrays.sort(nums);
        int closest=nums[0]+nums[1]+nums[2];
        for(int i=0; i<nums.length-2; i++){
            int j=i+1;
            int k=nums.length-1;
            while(j<k){
                int current=nums[i]+nums[j]+nums[k];
                if(Math.abs(current-target)<Math.abs(closest-target)){
                    closest=current;
                }
            if(current<target)
            j++;
            else if(current>target)
            k--;            
            else return closest;
        }
        
    }
    return closest;
    }
}