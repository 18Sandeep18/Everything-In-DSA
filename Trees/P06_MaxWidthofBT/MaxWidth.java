package Trees.P06_MaxWidthofBT;
import java.util.ArrayList;
import java.util.LinkedList;
import java.util.List;
import java.util.Queue;


class MaxWidth {

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
    class Pair{
        TreeNode n;
        int i;
        Pair(TreeNode k,int j){
            n = k;
            i = j;
        }
     }

     public int widthOfBinaryTree(TreeNode root) {
        Queue<Pair> q = new LinkedList<>();
        q.add(new Pair(root,0));
        int cnt = 0;
        while(q.size()>0){
            int n = q.size();
            List<Integer> ans = new ArrayList<>();
            for(int p = 0;p<n;p++){
                Pair rem1 = q.remove();
                TreeNode rem = rem1.n;
                int k = rem1.i;
                ans.add(k);
                if(rem.left!=null){
                    q.add(new Pair(rem.left,2*k+1));
                }

                if(rem.right!=null){
                    q.add(new Pair(rem.right,2*k+2));
                }
                
            }
            cnt = Math.max(cnt,ans.get(ans.size()-1)-ans.get(0)+1);
        }
        return cnt;
    }
    public static void main(String[] args) {
        //build you tree and pass it as TreeNode root....
    }
}

