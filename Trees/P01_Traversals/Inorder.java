package Trees.P01_Traversals;
import java.util.ArrayList;
import java.util.List;



class Inorder {
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
    public static void inHelper(TreeNode root, List<Integer> arr) {
        if (root == null)
            return;

        inHelper(root.left, arr);
        arr.add(root.val);
        inHelper(root.right, arr);
    }

    public List<Integer> inorderTraversal(TreeNode root) {
        List<Integer> arr = new ArrayList<>();
        inHelper(root, arr);
        return arr;
    }
    public static void main(String[] args) {
        //build you tree and pass it as TreeNode root....
        System.out.println("hi inorder");
    }
}