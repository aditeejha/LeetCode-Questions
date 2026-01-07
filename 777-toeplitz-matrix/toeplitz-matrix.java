class Solution {
    public boolean isToeplitzMatrix(int[][] matrix) {
        int n=matrix.length;
        int m=matrix[0].length;
        int flag=0;
        for(int i=0; i<n-1; i++){
            for(int j=0; j<m-1; j++){
                if(matrix[i][j]!=matrix[i+1][j+1]){
                    flag=1;
                    break;
                }
            }
        }
        if(flag==0) return true;
        else return false;
    }
}