class Solution {
    public int[] countBits(int n) {
        int[] arr=new int[n+1];
        for(int i=0; i<=n; i++){
            for(int j=0; j<31; j++){
                if(((i>>j)&1)==1) arr[i]++;
            }
        }
        return arr;
    }
}