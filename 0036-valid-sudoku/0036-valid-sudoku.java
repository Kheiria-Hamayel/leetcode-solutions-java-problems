class Solution {
    public boolean isValidSudoku(char[][] board) {
        Set<Character> [] rows = new HashSet[9];
        Set<Character> [] cols = new HashSet[9];
        Set<Character> [] boxes = new HashSet[9];

        for(int i = 0 ; i < 9 ; i++)
        {
            rows[i] = new HashSet<>();
            cols[i] = new HashSet<>();
            boxes[i] = new HashSet<>();
        }

        for(int i = 0 ; i < 9 ; i++ )
            for(int j = 0 ; j < 9 ; j++)
            {
                if(board[i][j] == '.')
                {
                    continue;
                }

                Character z = board[i][j]; 
                int boxIndex = 3* (i/3) + (j/3);

                if(!rows[i].add(z) || !cols[j].add(z) || !boxes[boxIndex].add(z))
                {
                    return false;
                }
            }

        return true;
    }
}


// class Solution {
//     public boolean isValidSudoku(char[][] board) {
//         Set<Character> [] rows = new HashSet[9];
//         Set<Character> []cols = new HashSet[9];
//         Set<Character> [] box = new HashSet[9];

//         for(int i = 0 ; i < 9 ; i++ )
//         {
//             rows[i] = new HashSet<>();
//             cols[i] = new HashSet<>();
//             box[i] = new HashSet<>();
//         }

//         for(int i = 0 ; i < 9 ; i++)
//         {
//             for(int j = 0 ; j <9 ; j++)
//             {
//                 if(board[i][j] == '.')
//                 {
//                     continue;
//                 }

//                 char val = board[i][j];
//                 int boxIndex = (i/3) * 3 +(j/3);

//                 if(!rows[i].add(val) || !cols[j].add(val) || !box[boxIndex].add(val))
//                 {
//                     return false;
//                 }
//             }
//         }
//         return true;
//     }
// }