class Solution {
    public int lengthOfLongestSubstring(String s) {
        Set<Character> set = new HashSet<>();
        int len = 0;
        int max = 0;
        int left = 0 ;
        char [] arr = s.toCharArray();

        if(s.length() == 1) return 1;
        for(char c : arr)
        {
            while(!set.add(c))
            {
                set.remove(arr[left++]);
            }
            max = Math.max(max, set.size()) ;
        }



        // Set<Character> lSet = new HashSet<>();
        // int left = 0 ;
        // int max = 0;
        // for(int i =0 ; i < s.length() ; i++)
        // {
        //     while(!lSet.add(s.charAt(i)))
        //     {
        //         lSet.remove(s.charAt(left++));
        //     }

        //     max = Math.max(max, lSet.size());
        // }


return max;
    }
}