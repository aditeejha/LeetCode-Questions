class Solution {
    public List<Long> mergeAdjacent(int[] nums) {
       int top=-1;
        long[] stack=new long[nums.length];
        for(int x:nums){
            long curr=x;
            while(top>=0 && stack[top]==curr){
                curr=curr*2;
                top--;
            }
            stack[++top]=curr;
        }
        ArrayList<Long> ans=new ArrayList<>();
        for(int i=0; i<=top;i++){
            ans.add(stack[i]);
        }
        return ans;
    }
}