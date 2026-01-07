class Solution {
    public int[][] matrixReshape(int[][] mat, int r, int c) {
        int n=mat.length;
        int m=mat[0].length;
        if((n*m)!=(r*c)) return mat;
        int [][] rshp= new int[r][c];
        int count=0;
        for(int i=0; i<n; i++){
            for(int j=0; j<m; j++){
                rshp[count/c][count%c]=mat[i][j];
                count++;
            }
        }
        return rshp;
    }
}