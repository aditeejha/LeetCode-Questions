class Solution {
    public int[][] constructProductMatrix(int[][] grid) {
        int n=grid.length;
        int m=grid[0].length;
        int mod=12345;
        int k=n*m;
        int[] arr=new int[k];
        int idx=0;
        for(int i=0; i<n; i++){
            for(int j=0; j<m; j++){
                arr[idx++]=grid[i][j]%mod;
            }
        }
        int[] prefix=new int[k];
        prefix[0]=1;
        for(int i=1; i<k; i++){
            prefix[i]=(prefix[i-1]*arr[i-1])%mod;
        }
        int[] suffix=new int[k];
        suffix[k-1]=1;
        for(int i=k-2; i>=0; i--){
            suffix[i]=(suffix[i+1]*arr[i+1]) % mod;
        }
        int[][] result=new int[n][m];
        idx=0;
        for(int i=0; i<n; i++){
            for(int j=0; j<m; j++){
                result[i][j]=(prefix[idx]*suffix[idx]) % mod;
                idx++;
            }
        }
        return result;
    }
}