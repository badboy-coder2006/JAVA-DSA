class Solution {
    public int[] findMode(TreeNode root) {
        ArrayList<Integer> ans = new ArrayList<>();
        pre(root, ans);

        HashMap<Integer, Integer> map = new HashMap<>();

        for (int num : ans) {
            map.put(num, map.getOrDefault(num, 0) + 1);
        }

        int max = 0;

        for (int count : map.values()) {
            max = Math.max(max, count);
        }

        ArrayList<Integer> result = new ArrayList<>();

        for (int key : map.keySet()) {
            if (map.get(key) == max) {
                result.add(key);
            }
        }

        return result.stream().mapToInt(Integer::intValue).toArray();
    }

    public void pre(TreeNode root, ArrayList<Integer> ans) {

        if (root == null) return;

        ans.add(root.val);

        pre(root.left, ans);
        pre(root.right, ans);
    }
}