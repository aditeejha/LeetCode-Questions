class Solution {
    public List<Integer> selfDividingNumbers(int left, int right) {
        ArrayList<Integer> num = new ArrayList<>();
        for(int i=left; i<=right; i++){
            int q=i;
            int flag=0;
            while(q>0){
                int ld=q%10;
                if(ld==0){
                    flag=2;
                    break;
                } 
                if((i%ld)!=0){
                    flag=1;
                    break;
                }
                q=q/10;
            }
            if(flag==0){
                num.add(i);
            }
        }
        return num;
    }
}