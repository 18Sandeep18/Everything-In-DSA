package Trees.Traversals;
import java.util.ArrayList;
import java.util.List;



class PreOrder {

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
    public static void preHelper(TreeNode root, List<Integer> arr) {
        if (root == null)
            return;

        arr.add(root.val);
        preHelper(root.left, arr);
        preHelper(root.right, arr);
    }

    public List<Integer> preOrderTraversal(TreeNode root) {
        List<Integer> arr = new ArrayList<>();
        preHelper(root, arr);
        return arr;
    }
    public static void main(String[] args) {
        //build you tree and pass it as TreeNode root....
    }
}