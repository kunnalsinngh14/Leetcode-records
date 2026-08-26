class Solution {


    public List<Integer> findAnagrams(String s, String p) {
        ArrayList<Integer> list = new ArrayList<>();
        char[] parr = p.toCharArray();
        Arrays.sort(parr);
        int window = parr.length;
        for(int i = 0; i<s.length(); i++){
            if(i+window<=s.length()){
            String subs = s.substring(i,i+window);
            char[] sarr = subs.toCharArray();
            Arrays.sort(sarr);
            if(Arrays.equals(parr,sarr)){
                list.add(i);
            }
            }
            else{
                break;
            }
        }
        return list;
    }
}