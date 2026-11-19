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
    String ans = null;

    public String smallestFromLeaf(TreeNode root) {
        dfs(root, new StringBuilder());
        return ans;
    }

    public void dfs(TreeNode root, StringBuilder sb) {

        if (root == null) {
            return;
        }

        sb.append((char)('a' + root.val));

        // Check if leaf node
        if (root.left == null && root.right == null) {

            String str = sb.reverse().toString();

            if (ans == null || str.compareTo(ans) < 0) {
                ans = str;
            }

            sb.reverse();
        }

        dfs(root.left, sb);
        dfs(root.right, sb);

        // Backtracking
        sb.deleteCharAt(sb.length() - 1);
    }
}
