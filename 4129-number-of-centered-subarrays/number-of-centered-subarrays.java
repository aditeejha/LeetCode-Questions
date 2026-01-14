class Solution {
    public int centeredSubarrays(int[] nums) {
        int n=nums.length;
        int count=0;
        for(int i=0; i<n; i++){
            int sum=0;
            for(int j=i; j<n; j++){
                sum+=nums[j];
                for(int k=i; k<=j; k++){
                if(sum== nums[k]){
                    count++;
                    break;
                }
                }     
            }
        }
        return count;
    }
}