class Solution {
    public List<List<String>> groupAnagrams(String[] strs) {
          if (strs == null || strs.length == 0) return new ArrayList<>();

        Map<String, List<String>> map = new HashMap<>();
        for (String s : strs) {// "eat","tea"
            char[] ca = new char[26];
            for (char c : s.toCharArray()) 
            ca[c - 'a']++; // e  // ca['e'-'a']++;
            String keyStr = String.valueOf(ca);
            if (!map.containsKey(keyStr)) 
            map.put(keyStr, new ArrayList<>());// e,a,t, <>
            map.get(keyStr).add(s);//"eat, <"eat", "tea">"
        }
        return new ArrayList<>(map.values());
    }
}