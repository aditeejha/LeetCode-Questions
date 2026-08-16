class Solution {
    public int elevatorRequests(int n, int[] requests) {
        int time=Math.abs(requests[0]-0);
        for(int i=1; i<requests.length; i++){
            time+=Math.abs(requests[i-1]-requests[i]);
        }
        return time;
    }
}