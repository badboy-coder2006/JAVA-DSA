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

    Map<Integer, Integer> map = new HashMap<>();
    int postIndex;

    public TreeNode buildTree(int[] inorder, int[] postorder) {

        postIndex = postorder.length - 1;

        // Store inorder indices
        for (int i = 0; i < inorder.length; i++) {
            map.put(inorder[i], i);
        }

        return build(inorder, postorder, 0, inorder.length - 1);
    }

    public TreeNode build(int[] inorder, int[] postorder,
                          int inLeft, int inRight) {

        // Base case
        if (inLeft > inRight) {
            return null;
        }

        // Create root
        int rootVal = postorder[postIndex--];
        TreeNode root = new TreeNode(rootVal);

        // Find root in inorder
        int mid = map.get(rootVal);

        // Build right subtree first
        root.right = build(inorder, postorder, mid + 1, inRight);

        // Build left subtree
        root.left = build(inorder, postorder, inLeft, mid - 1);

        return root;
    }
}