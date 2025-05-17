class Solution {
    public int[] topKFrequent(int[] nums, int k) {

        Map<Integer, Integer> map = new HashMap<>();
        int[] ans = new int[k];

        for (int num : nums) {
            if (!map.containsKey(num)) {
                map.put(num, 0);
            }
            map.put(num, map.get(num) + 1);
        }
        PriorityQueue<Integer> pq = new PriorityQueue((a, b) -> map.get(b) - map.get(a));
        pq.addAll(map.keySet());

        for (int i = 0; i < k; i++) {
            ans[i] = pq.poll();
        }
        return ans;
    }
}

// class Solution {
//     public int[] topKFrequent(int[] nums, int k) {

//         Map<Integer, Integer> map = new HashMap<>();
//         int[] ans = new int[k];

//         for (int num : nums) {
//             if (!map.containsKey(num)) {
//                 map.put(num, 0);
//             }
//             map.put(num, map.get(num) + 1);
//         }

//         List<Map.Entry<Integer, Integer> > list  = new ArrayList(map.entrySet());
//         list.sort((a, b) -> b.getValue() - a.getValue());

//         for (int i = 0; i < k; i++) {
//            ans[i] = list.get(i).getKey();
//         }
//         return ans;
//     }
// }