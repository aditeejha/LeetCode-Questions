class Solution {
    public int removeElement(int[] nums, int val) {
        int n=nums.length;
        int i=0; int j=n-1;
        while(i<=j){
            if(nums[i]==val && nums[j]==val){
                j--;
            }
            else if(nums[i]==val && nums[j]!=val){
                int temp=nums[i];
                nums[i]=nums[j];
                nums[j]=temp;
                i++;
                j--;
            }
            else i++;
        }
        return j+1;
    }
}