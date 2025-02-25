package Trees.P15_LCAinBST;

public class LCAinBST {

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
    public TreeNode helper(TreeNode root,TreeNode p,TreeNode q){
        while(root != null){

            if(root.val>p.val && root.val>q.val){
                root = root.left;
            }
            else if(root.val<p.val && root.val<q.val){
                root = root.right;
            }
            else{
                return root;
            }
        }
        return null;
    }
    public TreeNode lowestCommonAncestor(TreeNode root, TreeNode p, TreeNode q) {
        if(root == null){
            return null;
        }

        return helper(root,p,q);

    }
    public static void main(String[] args) {
        //build you tree and pass it as TreeNode root....
    }
}
