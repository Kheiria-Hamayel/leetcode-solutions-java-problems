class Solution {
    public boolean isHappy(int n) {
        Map<Integer,Integer> map = new HashMap<>();
        int s= findSqureSum(n);
        while (s != 1 )
        {
                if(map.containsKey(s)) return false;
                else
                {
                    map.put(s, n);
                    s= findSqureSum(s);
                }

        }
        return true;
    }

    private int findSqureSum(int n)
    {
        int ans = 0;
        int x;
        while(n != 0)
        {
            x = n % 10;
            ans += x*x;
            n = n/10; 
        }
        System.out.println(ans);

        return ans;
    }
}