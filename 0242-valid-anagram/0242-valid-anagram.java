class Solution {
    public boolean isAnagram(String s, String t) {
        int [] arr = new int[26];
        if(s.length() != t.length()  ) return false;
        for(char ch : s.toCharArray())
        {
            arr[ch - 'a']++;
        }
        for(char ch : t.toCharArray())
        {
            int tChar = arr[ch - 'a'];
            if(tChar == 0 ) return false;
            arr[ch - 'a']--;
        }

        for(int i =0 ; i < arr.length; i++)
        {
            if(arr[i] > 0) return false;
        }
    return true;
    
    }
}



// class Solution {
//     public boolean isAnagram(String s, String t) {
//         if(s.length() != t.length()  ) return false;

//         Map<Character, Integer> sMap = new HashMap<>();
//         Map<Character, Integer> tMap = new HashMap<>();


//         for(int i= 0; i < s.length() ; i++)
//         {
//             sMap.put(s.charAt(i), sMap.getOrDefault(s.charAt(i),1) + 1);
//             tMap.put(t.charAt(i), tMap.getOrDefault(t.charAt(i),1) + 1);
//         }

//         for(Character c : sMap.keySet() )
//         {
//             Integer valS = sMap.get(c);
//             Integer valt = tMap.get(c);
//             if(!valS.equals(valt)) return false;
//         }
//        return true;
//     }
// }