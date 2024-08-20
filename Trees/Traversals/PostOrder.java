package Trees.Traversals;
import java.util.ArrayList;
import java.util.List;


class PostOrder {
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
    public static void postHelper(TreeNode root, List<Integer> arr) {
        if (root == null)
            return;

            postHelper(root.left, arr);
            postHelper(root.right, arr);
            arr.add(root.val);
        }

    public List<Integer> postOrderTraversal(TreeNode root) {
        List<Integer> arr = new ArrayList<>();
        postHelper(root, arr);
        return arr;
    }
    public static void main(String[] args) {
        //build you tree and pass it as TreeNode root....
        System.out.println("Hi postorder");
    }
}