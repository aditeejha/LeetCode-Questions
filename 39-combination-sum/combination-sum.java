class Solution {

    public List<List<Integer>> combinationSum(int[] candidates, int target) {

        List<List<Integer>> ans = new ArrayList<>();

        backtrack(0, target, candidates, new ArrayList<>(), ans);

        return ans;
    }

    private void backtrack(int start, int target,
                           int[] candidates,
                           List<Integer> current,
                           List<List<Integer>> ans) {

        // Base case: found valid combination
        if (target == 0) {
            ans.add(new ArrayList<>(current));
            return;
        }

        // Base case: exceeded target
        if (target < 0) return;

        // Try each candidate
        for (int i = start; i < candidates.length; i++) {

            current.add(candidates[i]); // choose

            // Reuse allowed → pass i (not i+1)
            backtrack(i, target - candidates[i],
                      candidates, current, ans);

            current.remove(current.size() - 1); // unchoose
        }
    }
}
