class Solution {
    public int[] rearrangeArray(int[] nums) {
        int[] freq=new int[101];
        int max=0;
        for(int i=0; i<nums.length; i++){
            freq[nums[i]]++;
            max=Math.max(max,freq[nums[i]]);
        }
        int[] ans=new int[nums.length];
        int idx=0;
        for(int i=0; i<max; i++){
            for(int j=0; j<freq.length; j++){
                if(freq[j]!=0){
                    ans[idx]=j;
                    freq[j]--;
                    idx++;
                }
            }
        }
        return ans;
    }
}