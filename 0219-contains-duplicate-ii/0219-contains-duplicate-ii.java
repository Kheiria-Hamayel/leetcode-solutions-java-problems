class Solution {
    public boolean containsNearbyDuplicate(int[] nums, int k) {
        HashSet<Integer> set = new HashSet<>();
        int l = 0;
     
        for(int i= 0 ; i < nums.length ; i++)
        {
            if(i - l > k)
            {
                set.remove(nums[l]);
                l++;
            }

            if(set.contains(nums[i])) return true;
            set.add(nums[i]);
        }

        return false;
    }
}