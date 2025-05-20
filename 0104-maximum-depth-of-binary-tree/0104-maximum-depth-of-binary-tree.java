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
    public int maxDepth(TreeNode root) {
        if (root == null) return 0;

    Queue<TreeNode> q = new LinkedList<>();
    q.offer(root);
    int lev = 0;

    while(!q.isEmpty())
    {
        int s = q.size();
        for(int i = 0 ; i < s ; i++)
        {
        TreeNode curr = q.poll();
        if(curr.left != null) q.offer(curr.left);
        if(curr.right != null) q.offer(curr.right);
        }
        lev++;
    }



    // while(!q.isEmpty())
    // {
    //     int s = q.size();
    //     for(int i =0 ; i < s; i++)
    //     {
    //         TreeNode n = q.remove();
    //         if(n.left != null)
    //         {
    //             q.add(n.left);
    //         }
    //         if(n.right != null )
    //         {
    //             q.add(n.right);
    //         }

    //     }
    //             lev++;

    // }
        
    // // return 1+ Math.max(maxDepth(root.left), maxDepth(root.right));
    //     Queue <TreeNode> q = new LinkedList<>();
    //     int lev = 0;
    //     q.add(root);

    //     while(!q.isEmpty())
    //     {
    //         int s = q.size();
    //         for(int i =0 ; i < s ;i++ )
    //         {
    //             TreeNode n = q.remove();
    //             if(n.left != null)
    //             {
    //                 q.add(n.left);
    //             }
    //             if(n.right != null)
    //             {
    //                 q.add(n.right);
    //             }
    //         }
    //     lev++;

    //     }
        return lev;




 


    }
}