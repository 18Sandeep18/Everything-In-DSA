package Trees.P04_Diameter;


class Diameter {

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


    int ans = 0;
    public int height(TreeNode root){
        if(root == null)return 0;
        int lh = height(root.left);
        int rh = height(root.right);

        ans = Math.max(lh+rh,ans);
        return Math.max(lh,rh)+1;
    }
    public int diameterOfBinaryTree(TreeNode root) {
        height(root);
        return ans;
    }
    public static void main(String[] args) {
        //build you tree and pass it as TreeNode root....
    }
}
