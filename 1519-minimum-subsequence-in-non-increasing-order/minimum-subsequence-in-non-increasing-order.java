class Solution {
    public List<Integer> minSubsequence(int[] nums) {
        List<Integer> seq = new ArrayList<>();
        Arrays.sort(nums);
        int sumi=0;
        for(int i=nums.length-1; i>=0; i--){
            sumi+=nums[i];
            int sumj=0;
            for(int j=i-1; j>=0; j--){
                sumj+= nums[j];
            }
            if(sumi>sumj){
                seq.add(nums[i]);
                break;
            }
            seq.add(nums[i]);
        }
        return seq;
    }
}