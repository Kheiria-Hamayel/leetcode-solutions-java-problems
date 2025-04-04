class Solution {
    public boolean isIsomorphic(String s, String t) {

        Map<Character, List<Integer>> sMap = new HashMap<>();
        Map<Character, List<Integer>> tMap = new HashMap<>();

        for(int i = 0 ; i < s.length() ; i++)
        {
            sMap.putIfAbsent(s.charAt(i), new ArrayList<>());

            sMap.get(s.charAt(i)).add(i);
        } 

        for(int i = 0 ; i < t.length() ; i++)
        {
            tMap.putIfAbsent(t.charAt(i), new ArrayList<>());

            tMap.get(t.charAt(i)).add(i);
        } 
        
        if(s.length() != t.length()) return false;
        if(sMap.size() != tMap.size()) return false;

             System.out.println("sMap:");
        for (Map.Entry<Character, List<Integer>> entry : sMap.entrySet()) {
            System.out.println(entry.getKey() + ": " + entry.getValue());
        }

        // Print the tMap
        System.out.println("tMap:");
        for (Map.Entry<Character, List<Integer>> entry : tMap.entrySet()) {
            System.out.println(entry.getKey() + ": " + entry.getValue());
        }

        for(int i = 0 ; i < s.length(); i++)
        {
            Character t1 = t.charAt(i);
            Character s1 = s.charAt(i);

            List<Integer> sIndex1 = sMap.get(s1);
            List<Integer> tIndex1 = tMap.get(t1);

            Collections.sort(sIndex1);
            Collections.sort(tIndex1);

            if(sIndex1 != null && tIndex1 != null && sIndex1.size() != tIndex1.size()) return false;

            for(int j = 0 ; j < sIndex1.size() ; j++)
            {
                if(!sIndex1.get(j).equals(tIndex1.get(j))) return false;
            }

        }

        return true;

    }
}