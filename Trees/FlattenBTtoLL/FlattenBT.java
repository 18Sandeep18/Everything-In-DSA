package Trees.FlattenBTtoLL;

import java.util.Stack;

public class FlattenBT {
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
    public void flatten(TreeNode root) {
        if(root == null)return;
        Stack<TreeNode> st = new Stack<>();

        st.push(root);

        while(!st.isEmpty()){
            TreeNode cur = st.pop();

            if(cur.right != null){
                st.push(cur.right);
            }
            if(cur.left != null){
                st.push(cur.left);
            }
            if(st.size()>0){
                cur.right = st.peek();
            }
            cur.left = null;
        }
        
    }
    public static void main(String[] args) {
        //build you tree and pass it as TreeNode root....
    }
}
