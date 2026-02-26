class Solution {
    public List<String> validateCoupons(String[] code, String[] businessLine, boolean[] isActive) {
        int n = code.length;
        Map<String, Integer> order = new HashMap<>();
        order.put("electronics", 0);
        order.put("grocery", 1);
        order.put("pharmacy", 2);
        order.put("restaurant", 3);
        List<String[]> valid = new ArrayList<>();
        for (int i = 0; i < n; i++) {
            if (!isActive[i]) continue;
            if (!order.containsKey(businessLine[i])) continue;
            if (!isValidCode(code[i])) continue;
            valid.add(new String[]{businessLine[i], code[i]});
        }
        valid.sort((a, b) -> {
            int cmp = order.get(a[0]) - order.get(b[0]);
            if (cmp == 0) {
                return a[1].compareTo(b[1]);
            }
            return cmp;
        });
        List<String> result = new ArrayList<>();
        for (String[] entry : valid) {
            result.add(entry[1]);
        }
        return result;
    }
    private boolean isValidCode(String s) {

        if (s == null || s.length() == 0) return false;
        for (char c : s.toCharArray()) {
            if (!(Character.isLetterOrDigit(c) || c == '_')) {
                return false;
            }
        }
        return true;
    }
}
    