/**
 * Definition for a binary tree node.
 * public class TreeNode {
 *     int val;
 *     TreeNode left;
 *     TreeNode right;
 *     TreeNode() {}
 *     TreeNode(int val) { this.val = val; }
 *     TreeNode(int val, TreeNode left, TreeNode right) {
 *         this.val = val;
 *         this.left = left;
 *         this.right = right;
 *     }
 * }
 */
class Solution {
    public TreeNode invertTree(TreeNode root) {

        if(root == null) return null;
        //DFS

        TreeNode temp = root.right;
        root.right = root.left;
        root.left = temp;
        invertTree(root.right);
        invertTree(root.left);




        // TreeNode temp = root.left;
        // root.left = root.right;
        // root.right = temp;
        
        // invertTree(root.right);
        // invertTree(root.left);

        
        return root;
    }
}

// class Solution {

//     // Switches left and right pointers of 'root'
//     private static void invert(TreeNode root) {
//       if (root == null) return;
//       TreeNode temp = root.right;
//       root.right = root.left;
//       root.left = temp;
//     }

//     public TreeNode invertTree(TreeNode root) {
//       if (root == null) return null;
//       Queue<TreeNode> q = new LinkedList<>();
//       q.add(root);
//       while (q.size() > 0) {
//         int size = q.size();
//         for (int i = 0; i < size; i++) {
//           TreeNode temp = q.remove();
//           invert(temp);
//           if (temp.left != null) q.add(temp.left);
//           if (temp.right != null) q.add(temp.right);
//         }
//       }
//       return root;
//     }
// }