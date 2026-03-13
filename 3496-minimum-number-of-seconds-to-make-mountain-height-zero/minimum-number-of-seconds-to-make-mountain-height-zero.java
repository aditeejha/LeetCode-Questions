class Solution {
    public long minNumberOfSeconds(int mountainHeight, int[] workerTimes) {
       long left = 0;
        long right = (long)1e18;
        while (left < right) {
            long mid = left + (right - left) / 2;
            if (can(mid, mountainHeight, workerTimes))
                right = mid;
            else
                left = mid + 1;
        }
        return left;
    }
    private boolean can(long time, int height, int[] workerTimes) {
        long reduced = 0;
        for (int t : workerTimes) {
            long k = time / t;
            long x = (long)((Math.sqrt(1 + 8.0 * k) - 1) / 2);
            reduced += x;
            if (reduced >= height)
                return true;
        }
        return false; 
    }
}