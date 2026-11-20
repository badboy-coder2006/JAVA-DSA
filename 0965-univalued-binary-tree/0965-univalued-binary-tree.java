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
    public boolean isUnivalTree(TreeNode root) {
        return tree(root,root.val);
        
    }
    public boolean tree(TreeNode root, int v){
        if(root== null) return true;

        if(root.val!=v){
            return false;
        }
        


        return tree(root.left,v)&&tree(root.right,v);
    }
}