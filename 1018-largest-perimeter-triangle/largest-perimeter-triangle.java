class Solution {
    public int largestPerimeter(int[] nums) {
        Arrays.sort(nums);
        int i=nums.length-1;
        int j=i-1;
        int k=j-1;
        int peri=0;
        while(k>=0){
            if(nums[j]+nums[k]>nums[i]){
                int sum=nums[i]+nums[j]+nums[k];
                peri=Math.max(peri,sum);
            }
            i--;
            j--;
            k--;
        }
        return peri;
    }
}