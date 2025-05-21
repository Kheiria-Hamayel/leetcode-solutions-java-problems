class Solution {
    Map<Integer, List<Integer>> map = new HashMap<>();
    Set<Integer> visited = new HashSet<>();         // Already finished courses
    Set<Integer> recursionStack = new HashSet<>();  // Current DFS path

    public boolean canFinish(int numCourses, int[][] prerequisites) {
        map = convertToMap(prerequisites);

        for (int i = 0; i < numCourses; i++) {
            if (!dfs(i)) {
                return false; // cycle found, cannot finish all courses
            }
        }

        return true; // no cycles
    }

    public boolean dfs(int course) {
        if (recursionStack.contains(course)) {
            return false; // cycle detected
        }

        if (visited.contains(course)) {
            return true; // already processed
        }

        recursionStack.add(course);

        List<Integer> prereqs = map.get(course);
        if (prereqs != null) {
            for (Integer pre : prereqs) {
                if (!dfs(pre)) {
                    return false;
                }
            }
        }

        recursionStack.remove(course);
        visited.add(course); // mark as finished

        return true;
    }

    public Map<Integer, List<Integer>> convertToMap(int[][] prerequisites) {
        Map<Integer, List<Integer>> map = new HashMap<>();
        for (int[] pair : prerequisites) {
            map.computeIfAbsent(pair[0], k -> new ArrayList<>()).add(pair[1]);
        }
        return map;
    }
}

// class Solution {
//     Map<Integer, List<Integer>> map = new HashMap<>();
//     Set<Integer> set = new HashSet<>(); // to detect the loop existance
//     public boolean canFinish(int numCourses, int[][] pre) {

//         for(int i = 0 ; i < numCourses; i++)
//         {
//             map.put(i, new ArrayList<>());
//         }

//         for(int i = 0 ; i < pre.length; i++)
//         {
//             map.get(pre[i][0]).add(pre[i][1]);
//         }

//         for(int i = 0 ; i < numCourses; i++ )
//         {
//             if(!dfs(i)) return false;
//         }

//         return true;
        
//     }

//     private boolean dfs (int c)
//     {
//         if(set.contains(c))
//         {
//             return false;
//         }
//         if(map.get(c).isEmpty())
//         {
//             return true;
//         }

//         set.add(c);
//         for(Integer j : map.get(c))
//         {
//             if(!dfs(j)) return false;
//         }
        
//         set.remove(c);
//         map.put(c, new ArrayList<>());

//         return true;
//     }
// }

// class Solution {
//     Map<Integer, List<Integer>> preMap = new HashMap<>();
//     Set<Integer> set = new HashSet<>();
//     public boolean canFinish(int numCourses, int[][] preq) {

//         for(int i =0 ; i < numCourses  ; i++)
//         {
//             preMap.put(i,new ArrayList<>() );
//         }

//         for(int i =0 ; i < preq.length ; i++)
//         {

//             preMap.get(preq[i][0]).add(preq[i][1]);
            
//         }

// for(int i = 0 ; i< numCourses ; i++)
// {
//         if(!dfs(i)) return false;
// }
// return true;
//     }

//     private boolean dfs(int c)
//     {
//          if(set.contains(c))
//         {
//             return false; // already in set and visited 
//         }
//         if(preMap.get(c).isEmpty())
//         {
//             return true;
//         }


//         set.add(c);
//         for(int crs : preMap.get(c))
//         {
//             if(!dfs(crs)) return false;
//         }

//         set.remove(c);
//         preMap.put(c, new ArrayList<>());

//         return true;
        
//     }
// }