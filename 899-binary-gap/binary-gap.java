class Solution {
    public int binaryGap(int n) {
        int last = -1;
        int position = 0;
        int maxDist = 0;
        while (n > 0) {
            if ((n & 1) == 1) {
                if (last != -1) {
                    maxDist = Math.max(maxDist, position - last);
                }
                last = position;
            }
            n >>= 1;
            position++;
        }
        return maxDist;
    }
}