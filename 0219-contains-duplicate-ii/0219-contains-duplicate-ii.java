class Solution {
    public boolean containsNearbyDuplicate(int[] nums, int k) {
        HashSet<Integer> w = new HashSet<>();
        int l = 0;

        for(int i =0 ; i< nums.length ; i++ )
        {
            if(i - l > k) 
            {
                w.remove(nums[l]);
                l++;
            }
            if(w.contains(nums[i])) return true;
            w.add(nums[i]);

        }

        return false;
    }
}