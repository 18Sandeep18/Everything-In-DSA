package Trees.P11_MaxPathSum;

public class MaxPathSum {
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

    int ans;
    public int dfs(TreeNode root){
        if(root == null)return 0;
        int x = dfs(root.left);
        int y = dfs(root.right);
        y = Math.max(0,y);
        x = Math.max(0,x);
        ans = Math.max(ans,root.val+x+y);
        return root.val+Math.max(x,y);
    }
    public int maxPathSum(TreeNode root) {
        ans = Integer.MIN_VALUE;
        dfs(root);
        return ans;
    }

    public static void main(String[] args) {
        //build you tree and pass it as TreeNode root....
    }
}
