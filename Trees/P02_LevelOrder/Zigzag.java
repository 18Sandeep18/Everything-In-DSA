package Trees.P03_LevelOrder;
import java.util.ArrayList;
import java.util.LinkedList;
import java.util.List;
import java.util.Queue;

class Zigzag {

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
    public List<List<Integer>> zigzagLevelOrder(TreeNode root) {
        Queue<TreeNode> q = new LinkedList<>();
        List<List<Integer>> ans = new ArrayList<>();
        List<Integer> arr = new ArrayList<>();
        if(root == null)return ans;

        q.add(root);

            int i = 0;
        while(q.size()>0){
            int n = q.size();

                arr = new ArrayList<>();
            for(int k = 1;k<=n;k++){
                    TreeNode temp = q.remove();

                    arr.add(temp.val);


                    if(temp.left!=null){
                        q.add(temp.left);
                    }
                    if(temp.right != null){
                    
                        q.add(temp.right);
                    }


            }
            
            if(i%2 != 0){
                List<Integer> tempp = new ArrayList<>();
                for(int p = 0;p<arr.size();p++){
                    tempp.add(arr.get(arr.size()-p-1));
                    
                }
                    ans.add(tempp);

            }
            else{

                ans.add(arr);
            }

            i++;
        }
        return ans;
    }
    public static void main(String[] args) {
        //build you tree and pass it as TreeNode root....
    }
}