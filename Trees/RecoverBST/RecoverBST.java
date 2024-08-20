package Trees.RecoverBST;

public class RecoverBST {
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
    TreeNode f;
    TreeNode s;
    TreeNode prev;
    public void helper(TreeNode cur){
        if(cur == null)return;

        helper(cur.left);

        if(prev != null && prev.val>cur.val && f == null){
            f = prev;
            s = cur;
        }
        else if(prev != null && prev.val>cur.val && f != null){
            s = cur;
        }

        prev = cur;

        helper(cur.right);
    }
    public void recoverTree(TreeNode root) {
        f = null;
        s = null;prev = null;
        helper(root);
        int temp = f.val;
        f.val = s.val;
        s.val = temp;

    }
    public static void main(String[] args) {
        //build you tree and pass it as TreeNode root....
    }
}
