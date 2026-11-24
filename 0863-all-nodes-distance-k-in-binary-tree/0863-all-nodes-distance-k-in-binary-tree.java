/**
 * Definition for a binary tree node.
 * public class TreeNode {
 *     int val;
 *     TreeNode left;
 *     TreeNode right;
 *     TreeNode(int x) { val = x; }
 * }
 */
class Solution {

    Map<TreeNode, TreeNode> parent = new HashMap<>();

    public List<Integer> distanceK(TreeNode root, TreeNode target, int k) {

        findparent(root,null);

        Queue<TreeNode> q = new LinkedList<>();
        Set <TreeNode> visit = new HashSet<>();
        q.add(target);
        visit.add(target);

        int level = 0;

        while(!q.isEmpty()){

            int size =  q.size();

            if(level == k){
                List<Integer> ans = new ArrayList<>();

                for(TreeNode node :q){
                    ans.add(node.val);
                }
                return ans;
            }


            for(int i=0;i<size;i++){

                TreeNode curr = q.poll();
                if(curr.left!=null&&!visit.contains(curr.left)){
                    q.add(curr.left);

                    visit.add(curr.left);



                }

                if(curr.right != null && !visit.contains(curr.right)){
                    q.add(curr.right);
                    visit.add(curr.right);


                }

                TreeNode p = parent.get(curr);

                if(p != null && !visit.contains(p)) {
                    q.add(p);
                    visit.add(p);
                }
            }

            level++;
        }
        return new ArrayList<>();
    }

    public void findparent(TreeNode root, TreeNode par){

        if(root == null) return;

        parent.put(root,par);
        findparent(root.left,root);
        findparent(root.right,root);
    }

       
}