class Solution {
    public int sumFourDivisors(int[] nums) {
        int sum = 0;
        List<Integer> list = new ArrayList<>();
        for (int num : nums) {
            list.clear();  
            for (int i = 1; i * i <= num; i++) {

                if (num % i == 0) {
                    list.add(i);

                    if (i != num / i) {
                        list.add(num / i);
                    }
                }
            }
            if (list.size() == 4) {
                for (int x : list) {
                    sum += x;
                }
            }
        }
        return sum;
    }
}
