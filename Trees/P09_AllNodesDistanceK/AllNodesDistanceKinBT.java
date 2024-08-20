package Trees.P09_AllNodesDistanceK;

import java.util.ArrayList;
import java.util.HashMap;
import java.util.LinkedList;
import java.util.List;
import java.util.Queue;

public class AllNodesDistanceKinBT {
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

    public void mapParent(TreeNode root,HashMap<TreeNode,TreeNode> parentMap){
        //do simple bfs

        Queue<TreeNode> q = new LinkedList<>();
        q.add(root);
        while(q.size()>0){
            TreeNode rem = q.remove();
            if(rem.left!=null){
                parentMap.put(rem.left,rem);
                q.add(rem.left);
            }
            if(rem.right!=null){
                parentMap.put(rem.right,rem);
                q.add(rem.right);
            }
        }
    }
    public List<Integer> distanceK(TreeNode root, TreeNode target, int k) {
        //parent-map
        HashMap<TreeNode,TreeNode> parentMap = new HashMap<>();
        mapParent(root,parentMap);

        //go-left,go-right,go-upward by 1 distance everytime
        HashMap<TreeNode,Boolean> visMap = new HashMap<>();

        Queue<TreeNode> q = new LinkedList<>();
        q.add(target);
        visMap.put(target,true);
        int dis = 0;
        while(q.size()>0){
            int n = q.size();
            if(dis == k)break;
            dis++;
            for(int i = 0;i<n;i++){
                TreeNode rem = q.remove();
                if(rem.left!=null && visMap.get(rem.left) == null){
                    q.add(rem.left);
                    visMap.put(rem.left,true);
                }
                if(rem.right!=null && visMap.get(rem.right) == null){
                    q.add(rem.right);
                    visMap.put(rem.right,true);
                }
                if(parentMap.get(rem)!=null && visMap.get(parentMap.get(rem)) == null){
                    q.add(parentMap.get(rem));
                    visMap.put(parentMap.get(rem),true);
                }
            }
        }

        ArrayList<Integer> ans = new  ArrayList<>();
        while(q.size()>0){

            ans.add(q.remove().val);
        }
        return ans;

    }
    public static void main(String[] args) {
        //build you tree and pass it as TreeNode root....
    }
}
