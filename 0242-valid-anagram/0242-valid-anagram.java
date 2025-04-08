class Solution {
    public boolean isAnagram(String s, String t) {
        if(s.length() != t.length()  ) return false;

        Map<Character, Integer> sMap = new HashMap<>();
        Map<Character, Integer> tMap = new HashMap<>();


        for(int i= 0; i < s.length() ; i++)
        {
            sMap.put(s.charAt(i), sMap.getOrDefault(s.charAt(i),1) + 1);
            tMap.put(t.charAt(i), tMap.getOrDefault(t.charAt(i),1) + 1);
        }

        for(Character c : sMap.keySet() )
        {
            Integer valS = sMap.get(c);
            Integer valt = tMap.get(c);
            if(!valS.equals(valt)) return false;
        }
       return true;
    }
}