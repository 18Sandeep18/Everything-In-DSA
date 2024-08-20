package Trees.P05_LCAinBT;


class LCA {

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
        if(root == null)return null;

        if(root.val == p.val || root.val == q.val)return root;
        

        TreeNode leftAns =  helper(root.left,p,q);
        TreeNode rightAns = helper(root.right,p,q);


        if(leftAns != null && rightAns != null)return root;
        else if(leftAns !=null) return leftAns;
        else if(rightAns != null) return rightAns;
        else return null;
        
        
    }
    public TreeNode lowestCommonAncestor(TreeNode root, TreeNode p, TreeNode q) {
        return helper(root,p,q);
    }
    public static void main(String[] args) {
        //build you tree and pass it as TreeNode root....
    }
}
