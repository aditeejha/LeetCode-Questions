class Solution {
    public int minOperations(String s) {
        int n=s.length();
        int ans=Integer.MAX_VALUE;
        for(int k=0; k<n; k++){
            int ops=k;
            for(int i=0; i<n/2; i++){
                char a=s.charAt((k+i)%n);
                char b=s.charAt((k+n-1-i)%n);
                int cost1=(a-b+26)%26;
                int cost2=(b-a+26)%26;
                ops+=Math.min(cost1, cost2);
            }
            ans=Math.min(ans, ops);
        }
        return ans; 
    }
}