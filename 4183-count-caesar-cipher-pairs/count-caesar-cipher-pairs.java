// class Solution {
//     public long countPairs(String[] words) {
//         int n=words.length;
//         int count=0;
//         for(int i=0; i<n; i++){
//             for(int j=i+1; j<n; j++){
//                 if(isSimilar(words[i],words[j])){
//                      count++;
//                 }
//             }
//         }
//         return count;
//     }
//     public boolean isSimilar(String s,String t){
//         if(s.length()!=t.length()){
//             return false;
//         }
//         int diff=(t.charAt(0)-s.charAt(0)+26)%26;
//         for(int i=0; i<s.length(); i++){
//             if((s.charAt(i)-'a'+diff+26)%26 != t.charAt(i)-'a'){
//                 return false;
//             }
//         }
//         return true;
//     }
// }
class Solution {
    public long countPairs(String[] words) {
        int n = words.length;

        for (int i = 0; i < n; i++) {
            words[i] = normalize(words[i]);
        }

        Arrays.sort(words);

        long ans = 0;
        long cnt = 1;

        for (int i = 1; i < n; i++) {
            if (words[i].equals(words[i - 1])) {
                cnt++;
            } else {
                ans += cnt * (cnt - 1) / 2;
                cnt = 1;
            }
        }

        ans += cnt * (cnt - 1) / 2;
        return ans;
    }

    private String normalize(String s) {
        StringBuilder sb = new StringBuilder();
        int shift = s.charAt(0) - 'a';

        for (int i = 0; i < s.length(); i++) {
            int val = (s.charAt(i) - 'a' - shift + 26) % 26;
            sb.append((char) ('a' + val));
        }

        return sb.toString();
    }
}
