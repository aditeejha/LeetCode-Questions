class Solution {
    public int minimumCost(int[] nums) {
        int n = nums.length;
        int minCost = Integer.MAX_VALUE;
        for (int i = 1; i <= n - 2; i++) {
            for (int j = i + 1; j <= n - 1; j++) {
                int cost = nums[0] + nums[i] + nums[j];
                minCost = Math.min(minCost, cost);
            }
        }

        return minCost;
    }
}