
class Solution {
    public List<Integer> postorder(Node root) {
        List<Integer> ans = new ArrayList<>();
        post(root, ans);
        return ans;
    }

    public void post(Node root, List<Integer> ans) {
        if (root == null) return;

        if (root.children != null) {
            for (Node child : root.children) {
                post(child, ans);
            }
        }

        ans.add(root.val);
    }
}
