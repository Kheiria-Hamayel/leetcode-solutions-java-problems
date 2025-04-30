class Solution {
    public int longestConsecutive(int[] nums) {
       Set<Integer> numSet = new HashSet<>();
       int longest = 0 ;
       for(int x : nums)
       {
        numSet.add(x);
       }

   for (int x : numSet) 
       {
        if(!numSet.contains(x - 1)) // seq begin
            {
                int len = 0;
                while(numSet.contains(x+len))
                {
                    len++;
                }

                longest = Math.max(longest,len);

            }
       }

        return longest;
    }
}