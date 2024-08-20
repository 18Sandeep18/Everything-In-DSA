package Trees.P12_IsBST;

public class IsBST {
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
    public boolean fun(TreeNode root,long min,long max){

        if(root == null)return true;

        if(root.val<=min || root.val>=max){
            return false;
        }
        


        boolean l = fun(root.left,min,root.val);
        boolean r = fun(root.right,root.val,max);

        return l&r;
    }
    
    public boolean isValidBST(TreeNode root) {
        return fun(root,Long.MIN_VALUE,Long.MAX_VALUE);

    }

    public static void main(String[] args) {
        //build you tree and pass it as TreeNode root....
    }
}
