class Solution {
    public int[] productExceptSelf(int[] nums) {

        int [] ans = new int [nums.length];
        int left = 1; 
        int right = 1;
        int n = nums.length;

        ans[0] = left;
        for(int i = 1 ; i < nums.length ; i++)
        {
            ans[i] = ans[i-1] * nums[i - 1];

        }

        for(int i = n-1; i>=0 ; i-- )
        {
            ans[i] = ans[i] * right;
            right = right * nums[i];
        }




        return ans;
        
    }
}

// class Solution {
//     public int[] productExceptSelf(int[] nums) {

//         int [] res = new int [nums.length];
//         int pref = 1;
//         int suf = 1;

//         for(int i = 0; i< nums.length ; i++)
//         {
//             res[i] = pref;
//             pref *= nums[i];
//         }

//         for(int i = nums.length -1 ; i>= 0 ; i--)
//         {
//             res[i] *= suf;
//             suf *= nums[i];
//         }




//         return res;
        
//     }
// }