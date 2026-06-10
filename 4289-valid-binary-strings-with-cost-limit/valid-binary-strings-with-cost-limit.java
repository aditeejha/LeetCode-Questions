class Solution {
    public List<String> generateValidStrings(int n, int k) {
        List<String> ans=new ArrayList<>();
        backtrack(0,n,k,-1,0, new StringBuilder(), ans);
        return ans;
    }
    private void backtrack(int idx, int n, int k, int prev, int cost, StringBuilder sb, List<String> ans){
        if(cost>k) return;
        if(idx==n){
            ans.add(sb.toString());
            return;
        }
        sb.append('0');
        backtrack(idx+1, n, k, 0, cost, sb, ans);
        sb.deleteCharAt(sb.length()-1);
        if(prev!=1){
            sb.append('1');
            backtrack(idx+1, n, k, 1, cost+idx, sb, ans);
            sb.deleteCharAt(sb.length()-1);
        }
    }
}