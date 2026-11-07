class Solution {
    private int gcd(int a, int b){
        while(b!=0){
            int temp=b;
            b=a%b;
            a=temp;
        }
        return a;
    }
    public boolean repeatedStringMatch(String a, String b, int x, int y) {
        int m=a.length();
        int n=b.length();
        long tota=(long)m*x;
        long totb=(long)n*y;
        if(totb>tota) return false;
        int g=gcd(m,n);
        long limit=Math.min(totb,(long)m+n-g);
        long maxStart=Math.min(m-1, tota-totb);
        for(int j=0; j<=maxStart; j++){
            boolean match=true;
            for(long i=0; i<limit; i++){
                char c1=a.charAt((int)((j+i)%m));
                char c2=b.charAt((int)(i%n));
                if(c1!=c2){
                    match=false;
                    break;
                }
            }
            if(match){
                return true;
            }
        }
        return false;
    }
}