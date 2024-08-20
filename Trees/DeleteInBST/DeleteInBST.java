package Trees.DeleteInBST;

public class DeleteInBST {
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
    public TreeNode find(TreeNode root){
        while(root.right!=null){
            root = root.right;
        }
        return root;
    }
    public TreeNode help(TreeNode root){
        if(root.left == null && root.right == null)return null;
        if(root.left == null){
            return root.right;
        }
        else if(root.right == null){
            return root.left;
        }
        else{
            TreeNode maxLeftNode = find(root.left);
            TreeNode rightNode = root.right;
            maxLeftNode.right = rightNode;

            return root.left;

        }
    }
    public TreeNode deleteNode(TreeNode root, int key) {
        if(root == null)return null;
        if(root.val == key){
            return help(root);
        }

        TreeNode temp = root;
        while(temp!=null){
            if(temp.val<key){
                if(temp.right != null){
                    if(temp.right.val == key){
                        temp.right = help(temp.right);
                        break;
                    }else{
                        temp = temp.right;
                    }
                }else{
                    break;
                }
            }
            else{
                if(temp.left != null){
                    if(temp.left.val == key){
                        temp.left = help(temp.left);
                        break;
                    }else{
                        temp = temp.left;
                    }
                }
                else{
                    break;
                }
            }
        }

        //we set our temp node at our required deletion node

        //solve three cases

        //1.if there are no children
        //2. only one child
        //3.both child present

        return root;
        
    }

    public static void main(String[] args) {
        //build you tree and pass it as TreeNode root....
    }
}
