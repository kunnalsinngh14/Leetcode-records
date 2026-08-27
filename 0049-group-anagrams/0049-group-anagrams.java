class Solution {
    public List<List<String>> groupAnagrams(String[] strs) {
        List<List<String>> list = new ArrayList<>();
        Set<String> visited = new HashSet<>();
        for (int i = 0; i < strs.length; i++) {
            if (visited.contains(strs[i])) {
                continue;
            } else {
                List<String> arr = new ArrayList<>();
                arr.add(strs[i]);
                visited.add(strs[i]);
                if (i + 1 > strs.length) {
                    list.add(arr);
                    return list;
                }
                int j = 0;
                HashMap<Character, Integer> map = new HashMap<>();
                while (j < strs[i].length()) {
                    char ch = strs[i].charAt(j);
                    map.put(ch, map.getOrDefault(ch, 0) + 1);
                    j++;
                }
                for (int k = i + 1; k < strs.length; k++) {
                    if (strs[i].length() != strs[k].length()) {
                        continue;
                    }
                    HashMap<Character, Integer> temp = new HashMap<>(map);
                    int x = 0;
                    while (x < strs[k].length()) {
                        char ch = strs[k].charAt(x);
                        if (!temp.containsKey(ch)) {
                            break;
                        }
                        temp.put(ch, temp.get(ch) - 1);
                        if (temp.get(ch) == 0) {
                            temp.remove(ch);
                        }
                        x++;
                    }
                    if (temp.isEmpty()) {
                        arr.add(strs[k]);
                        visited.add(strs[k]);
                    }
                }
                list.add(arr);
            }
        }
        return list;
    }
}