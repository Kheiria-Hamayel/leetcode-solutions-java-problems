class Solution {
    public List<List<String>> groupAnagrams(String[] strs) {
        List<List<String>> ans = new ArrayList<>();
        List<String>sub = new ArrayList<>();
        Map<String,List<Integer>> map = new HashMap<>();
        if(strs.length == 1) 
        {
            sub.add(strs[0]);
            ans.add(sub);
            return ans;
        }

        for(int i = 0; i < strs.length ; i++)
        {
            char [] chars = strs[i].toCharArray();
            Arrays.sort(chars);
            String k = new String(chars);
            if(!map.containsKey(k))
            {
                map.put(k, new ArrayList<>());
            }
            map.get(k).add(i);
        }

        for(Map.Entry<String, List<Integer>> entry : map.entrySet())
        {
            List<Integer> list = entry.getValue();
            List<String>sub1 = new ArrayList<>();

            for(Integer n : list)
            {
                sub1.add(strs[n]);
            }
            ans.add(sub1);
        }

return ans;


        
    }
}