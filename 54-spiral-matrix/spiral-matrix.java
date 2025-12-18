import java.util.*;

class Solution {
    public List<Integer> spiralOrder(int[][] matrix) {
        List<Integer> result = new ArrayList<>();

        int m = matrix.length;
        int n = matrix[0].length;

        int top = 0, bottom = m - 1;
        int left = 0, right = n - 1;

        while (top <= bottom && left <= right) {

            // left → right (top row)
            for (int k = left; k <= right; k++) {
                result.add(matrix[top][k]);
            }
            top++;

            // top → bottom (right column)
            for (int k = top; k <= bottom; k++) {
                result.add(matrix[k][right]);
            }
            right--;

            // right → left (bottom row)
            if (top <= bottom) {
                for (int k = right; k >= left; k--) {
                    result.add(matrix[bottom][k]);
                }
                bottom--;
            }

            // bottom → top (left column)
            if (left <= right) {
                for (int k = bottom; k >= top; k--) {
                    result.add(matrix[k][left]);
                }
                left++;
            }
        }

        return result;
    }
}
