class Solution {
    public List<String> twoEditWords(String[] queries, String[] dictionary) {
        ArrayList<String> list=new ArrayList<>();
        int n=queries.length;
        int m=dictionary.length;
        int x=queries[0].length();
        for(int i=0; i<n; i++){
            for(int j=0; j<m; j++){
                int flag=0;
                for(int k=0; k<x; k++){
                    if(queries[i].charAt(k)!=dictionary[j].charAt(k) ) flag++;
                }
                if(flag<=2){
                     list.add(queries[i]);
                     break;
                }
            }
        }
        return list;
    }
}