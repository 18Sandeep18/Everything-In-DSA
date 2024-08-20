package Trees.LevelOrder;
import java.util.ArrayList;
import java.util.LinkedList;
import java.util.List;
import java.util.Queue;


class LevelOrder01 {

    public class TreeNode {
        int val;
        TreeNode left;
        TreeNode right;
    
        TreeNode() {
        }
    
        TreeNode(int val) {
            this.val = val;
        }
    
        TreeNode(int val, TreeNode left, TreeNode right) {
            this.val = val;
            this.left = left;
            this.right = right;
        }
    }
    public List<List<Integer>> levelOrder(TreeNode root) {
        List<List<Integer>> arr = new ArrayList<>();
        Queue<TreeNode> q = new LinkedList<>();
        
        q.add(root);
        while(q.size()>0){
            int n = q.size();

            List<Integer> sarr = new ArrayList<>();
            while(n>0){
                TreeNode temp = q.remove();
                if(temp == null){
                    return arr;
                }
                sarr.add(temp.val);
                if(temp.left!=null){
                    q.add(temp.left);
                }
                if(temp.right!=null){
                    q.add(temp.right);
                }
                n--;

            }
            arr.add(sarr);
        }
        
        return arr;

    }
    public static void main(String[] args) {
        //build you tree and pass it as TreeNode root....
    }
}
