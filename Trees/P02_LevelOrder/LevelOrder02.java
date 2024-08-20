package Trees.P02_LevelOrder;
import java.util.ArrayList;
import java.util.LinkedList;
import java.util.List;
import java.util.Queue;


class LevelOrder02 {

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
    public List<List<Integer>> levelOrderBottom(TreeNode root) {
        List<List<Integer>> arr = new ArrayList<>();
        Queue<TreeNode> q = new LinkedList<>();

        if(root == null) return arr;
        q.add(root);

        while(q.size()>0){
            int n = q.size();
            List<Integer> larr = new ArrayList<>();
            while(n>0){
                TreeNode temp = q.remove();
               
                larr.add(temp.val);

                if(temp.left!=null){
                    q.add(temp.left);
                }
                if(temp.right!=null){
                    q.add(temp.right);
                }
                n--;
            }
            arr.add(larr);
        }
        List<List<Integer>> rev = new ArrayList<>();
        for (int i = arr.size() - 1; i >= 0; i--) {
 
            // Append the elements in reverse order
            rev.add(arr.get(i));
        }
        return rev;
    }
    public static void main(String[] args) {
        //build you tree and pass it as TreeNode root....
    }
}
