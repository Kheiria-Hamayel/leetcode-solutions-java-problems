class Solution {
    public boolean wordPattern(String pattern, String s) {

        Map<String, Integer> mapS  = new HashMap<>();
        Map<Character, Integer> mapPattern = new HashMap<>();

        String [] sArray = s.split(" ");

        if(sArray.length != pattern.length()) return false;


        for(int i = 0 ; i < pattern.length(); i++ )
        {
            if(!mapS.containsKey(sArray[i]))
            {
                mapS.put(sArray[i], i);
            }
            if(!mapPattern.containsKey(pattern.charAt(i)))
            {
                mapPattern.put(pattern.charAt(i), i);
            }
            if(!mapPattern.get(pattern.charAt(i)).equals(mapS.get(sArray[i])))
            {
                return false;
            }

        }

        return true;
        
    }
}