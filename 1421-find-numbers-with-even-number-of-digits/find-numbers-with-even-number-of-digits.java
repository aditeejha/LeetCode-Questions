class Solution {
    public int findNumbers(int[] nums) {
        int n=nums.length;
        int count=0;
        for(int i=0; i<n; i++){
            int q=nums[i];
            int cnt=0;
            while(q>0){
                int ld=q%10;
                cnt++;
                q=q/10;
            }
            if(cnt%2 == 0){
                count++;
            }
        }
        return count;
    }
}