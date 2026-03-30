class Solution {
    public int numberOfSteps(int num) {
        int cnt=0;
        int k=num;
        while(k!=0){
            if(k%2==0){
                k=k/2;
                cnt++;
            }
            else{
                k--;
                cnt++;
            }
        }
        return cnt;
    }
}