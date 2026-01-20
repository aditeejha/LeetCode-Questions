class Solution {
    public boolean canPlaceFlowers(int[] flowerbed, int n) {
        int count=0;
        int k=flowerbed.length;
        for(int i=0; i<k; i++){
            if(flowerbed[i]==0){
            boolean lEmp= (i==0)|| flowerbed[i-1]==0;
            boolean rEmp= (i==k-1)|| flowerbed[i+1]==0;
            if(lEmp && rEmp){
                count++;
                flowerbed[i]=1;
                if(count>=n){
            return true;
        }
            }
        }


        
        
        
    }
    return count>=n;
    }
}