 public class TreeNode {
     int val;
      TreeNode left;
      TreeNode right;
      TreeNode() {}
      TreeNode(int val) { this.val = val; }
 *    TreeNode(int val, TreeNode left, TreeNode right) {
          this.val = val;
 *         this.left = left;
 *         this.right = right;
 *     }
 * }
 */
class Solution {
    public List<List<Integer>> levelOrder(TreeNode root) {
        List<List<Integer>> ret =new ArrayList<>();
        if(root == null) return ret ;

        Queue<TreeNode> queue =new LinkedList<>();
        queue.offer(root);

        while(!queue.isEmpty()){
            int  size = queue.size();
            List<Integer> list =new ArrayList<>();
            while (size != 0){
                TreeNode cur =queue.poll();
                list.add(cur.val);
                size--;
                if(cur.left !=null){
                    queue.offer(cur.left);
                }
                if(cur.right !=null){
                    queue.offer(cur.right);
                }
            }
            ret.add(list);
        }
        return ret;
    }

}

