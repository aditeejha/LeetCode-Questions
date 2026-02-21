class Solution {
    public int countPrimeSetBits(int left, int right) {
        int count = 0;
        int primeMask = 665772;   
        for (int i = left; i <= right; i++) {
            int bits = Integer.bitCount(i);
            if ((primeMask & (1 << bits)) != 0) {
                count++;
            }
        }
        return count;
    }
}