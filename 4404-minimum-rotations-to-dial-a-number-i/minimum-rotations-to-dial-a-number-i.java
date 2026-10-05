class Solution {
    public int minRotations(String s) {
        int rtr=0;
        int ptr=0;
        for(int i=0; i<s.length(); i++){
            int d=Math.abs((s.charAt(i)-'0')-ptr);
            rtr+=Math.min(d,10-d);
            ptr=(s.charAt(i)-'0');
        }
        return rtr;
    }
}