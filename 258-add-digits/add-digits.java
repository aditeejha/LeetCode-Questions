class Solution {
    public int addDigits(int num) {
        int a = num;
        while (a >= 10) {    
            a = single(a);    
        }
        return a;
    }
    public int single(int a) {
        int sum = 0;
        while (a > 0) {
            int ld = a % 10;
            sum = sum + ld;
            a = a / 10;
        }
        return sum;
    }
}
