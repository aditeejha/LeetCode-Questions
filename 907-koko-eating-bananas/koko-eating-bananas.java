class Solution {
    public int minEatingSpeed(int[] piles, int h) {
        Arrays.sort(piles);
        int low=1; int high=piles[piles.length-1];
        int ans=high;
        while(low<=high){
            int mid=(low+high)/2;
            int totalhrs=func(piles,mid);
            if(totalhrs<=h){
                ans= mid; 
                high=mid-1;
            }
            else
            { low=mid+1;
            }
            }
        // for(int i=1; i<=piles[piles.length-1]; i++){
        //     int reqtime=func(piles,i);
        //     if(reqtime<=h){
        //         return i;
        //     }
        // }
        return ans;
    }
    public int func(int[] piles, int hourly){
        int totalhrs=0;
        for(int i=0; i<piles.length; i++){
           totalhrs+=Math.ceil((double)piles[i]/hourly);
        }
        return totalhrs;
    }
}