
class Solution {
    public List<Integer> preorder(Node root) {
        List<Integer> ans = new ArrayList<>();
        pre(root, ans);
        return ans;
    }

    public void pre(Node root, List<Integer> ans) {
        if (root == null) {
            return;
        }

        ans.add(root.val);

        if (root.children != null) {
            for (Node child : root.children) {
                pre(child, ans);
            }
        }
    }
}
