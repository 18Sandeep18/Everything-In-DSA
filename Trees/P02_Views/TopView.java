package Trees.P02_Views;
import java.util.ArrayList;
import java.util.HashMap;
import java.util.LinkedList;
import java.util.Queue;



class TopView {

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

    static class Pair{
        TreeNode node;
        int val;
        Pair(TreeNode node,int val){
            this.val = val;
            this.node = node;
        }
    }
    static ArrayList<Integer> topView(TreeNode root) {
        // add your code
        Queue<Pair> q = new LinkedList<>();
        HashMap<Integer,TreeNode> map = new HashMap<>();
        
        q.add(new Pair(root,0));
        int min = Integer.MAX_VALUE;
        int max = Integer.MIN_VALUE;
        
        while(q.size()>0){
            Pair p = q.remove();
            TreeNode a = p.node;
            int b = p.val;
            
            if(!map.containsKey(b)){
                map.put(b,a);
                if(min>b){
                    min = b;
                }
                if(max<b){
                    max = b;
                }
            }
            if(a.left!=null){
                q.add(new Pair(a.left,b-1));
            }
            if(a.right != null){
                q.add(new Pair(a.right,b+1));
            }
        }
        
        ArrayList<Integer> arr = new ArrayList<>();
        
        for(int i = min;i<=max;i++){
            arr.add(map.get(i).val);
        }
        
        return arr;
    }
    public static void main(String[] args) {
        //build you tree and pass it as TreeNode root....
    }
}
