package Trees.ConstructBt;


class FromInorderNPostOrder {

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
    public TreeNode solve(int[] inorder,int postorder[],int inStart,int inEnd,int postStart,int postEnd){
        //we know that our root will be last index value in our postorder in every recursive call
        if(inStart>inEnd)return null;
        TreeNode root = new TreeNode(postorder[postEnd]);

        //traverse in inorder and check at which index, our root present in inorder
        int i;
        for( i = inStart;i<=inEnd;i++){
            if(inorder[i] == root.val)break;
        }
        //Now i is at the root node for this current level... 
        //we keep trust in recursion that answer for my self....i solved

        //now recursion we give me answers for ledt subtree and right subtree

        //left-subtree answer

        //to do that...we need size of left inorder tree and right as well
        int leftSize = i-inStart;
        // int rightSize = inEnd-i;
        root.left = solve(inorder,postorder,inStart,i-1,postStart,postStart+leftSize-1);
        root.right = solve(inorder,postorder,i+1,inEnd,postStart+leftSize,postEnd-1);
        return root;
    }
    public TreeNode buildTree(int[] inorder, int[] postorder) {
        return solve(inorder,postorder,0,inorder.length-1,0,postorder.length-1);
    }
    public static void main(String[] args) {
        //build you tree and pass it as TreeNode root....
    }
}
