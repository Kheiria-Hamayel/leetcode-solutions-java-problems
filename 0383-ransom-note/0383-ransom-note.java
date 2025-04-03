class Solution {
    public boolean canConstruct(String ransomNote, String magazine) { 

    //Map to store freq 
        Map<Character, Integer> mag = new HashMap<>();

        for(int i = 0 ; i < magazine.length() ; i++)
        {
            mag.put(magazine.charAt(i), mag.getOrDefault(magazine.charAt(i),0) + 1);
        }

        for(int i = 0 ; i < ransomNote.length() ; i++)
        {
            if(mag.containsKey(ransomNote.charAt(i)) && mag.get(ransomNote.charAt(i)) >= 1 )
            {
                mag.put(ransomNote.charAt(i), mag.get(ransomNote.charAt(i)) - 1);
            }
            else
            {
                return false;
            }
        }
        
        return true;
    }
}