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

    HashMap<Integer, Integer> map = new HashMap<>();
    int maxFreq = 0;

    public int[] findFrequentTreeSum(TreeNode root) {

        dfs(root);

        List<Integer> ans = new ArrayList<>();

        for (int key : map.keySet()) {
            if (map.get(key) == maxFreq) {
                ans.add(key);
            }
        }

        int[] result = new int[ans.size()];

        for (int i = 0; i < ans.size(); i++) {
            result[i] = ans.get(i);
        }

        return result;
    }

    public int dfs(TreeNode root) {

        if (root == null) return 0;

        int left = dfs(root.left);
        int right = dfs(root.right);

        int sum = root.val + left + right;

        map.put(sum, map.getOrDefault(sum, 0) + 1);

        maxFreq = Math.max(maxFreq, map.get(sum));

        return sum;
    }
}