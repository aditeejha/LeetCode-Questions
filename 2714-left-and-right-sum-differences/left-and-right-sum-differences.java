class Solution {
    public int[] leftRightDifference(int[] nums) {
        int[] ls=new int[nums.length];
        int[] rs=new int[nums.length];
        ls[0]=0;
        int n=nums.length;
        rs[n-1]=0;
        int sum1=0;
        for(int i=0;i<n; i++){
            ls[i]=sum1;
            sum1+=nums[i];
        }
        int sum2=0;
        for(int i=n-1;i>=0; i--){
            rs[i]=sum2;
            sum2+=nums[i];
        }
        int[] ans=new int[n];
        for(int i=0; i<n; i++){
            ans[i]= Math.abs(ls[i]-rs[i]);
        }
        return ans;
    }
}