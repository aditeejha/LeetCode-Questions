class Solution {
    public boolean findRotation(int[][] mat, int[][] target) {
        for(int k=0; k<4; k++) {
            if(areEqual(mat,target)) return true;
            rotateInPlace(mat);
        }
        return false;
    }
    private boolean areEqual(int[][] a, int[][] b) {
        int n=a.length;
        for(int i=0;i<n;i++) {
            for(int j=0; j<n;j++) {
                if(a[i][j]!=b[i][j]) return false;
            }
        }
        return true;
    }
    private void rotateInPlace(int[][] mat) {
        int n=mat.length;
        for(int i=0; i<n; i++) {
            for(int j=i; j<n; j++) {
                int temp=mat[i][j];
                mat[i][j]=mat[j][i];
                mat[j][i]=temp;
            }
        }
        for(int i=0; i<n; i++) {
            int left=0, right=n-1;
            while(left<right) {
                int temp=mat[i][left];
                mat[i][left]=mat[i][right];
                mat[i][right]=temp;
                left++;
                right--;
            }
        }
    }
}