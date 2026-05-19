class Solution {
    public int valueAfterKSeconds(int n, int k) {
        int MOD=1_000_000_007;
        int cnt=0;
        int[] arr=new int[n];
        for(int i=0; i<n; i++){
            arr[i]=1;
        }
        while(cnt!=k){
            int idx=0;
            //for(int i=0; i<n; i++){
                for(int j=1; j<n; j++){
                    arr[j]=(arr[j]+arr[idx])%MOD;
                    idx++;
                    if(idx>n) break;
                }
            //}
            cnt++;
        }
        return arr[n-1];
    }
}