class Solution {
    public int countValidSelections(int[] nums) {
        int n = nums.length;
        int totalSum = 0;
        for (int num : nums) {
            totalSum += num;
        }
        int prefix = 0;
        int count = 0;
        for (int i = 0; i < n; i++) {
            if (nums[i] == 0) {
                int leftSum = prefix;
                int rightSum = totalSum - prefix;
                int diff = Math.abs(leftSum - rightSum);
                if (diff == 0) {
                    count += 2;  
                } else if (diff == 1) {
                    count += 1;  
                }
            }
           prefix += nums[i];
        }
        return count;
    }
}