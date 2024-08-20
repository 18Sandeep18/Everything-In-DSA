package Trees.P10_PsuedoPalindromicPaths;

import java.util.HashMap;
import java.util.Map;

public class PPP {
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
    public int pseudoPalindromicPaths (TreeNode root) {
        Map<Integer,Integer>map=new HashMap<>();
        int ans[]={0};
        pathFind(root,map,ans);
        return ans[0];
    }

    public void pathFind(TreeNode root,Map<Integer,Integer>map,int ans[]){
        if(root==null) return;

        if(root.left==null && root.right==null){
            map.put(root.val,map.getOrDefault(root.val,0)+1);
            int oddCount=0;
            for(int i=1;i<=9;i++){
                if(map.get(i)!=null && map.get(i)%2!=0) oddCount++;
            }

            if(oddCount<=1) ans[0]++;
            map.put(root.val,map.get(root.val)-1);
            return;
        }
        
        map.put(root.val,map.getOrDefault(root.val,0)+1);

        pathFind(root.left,map,ans);
        pathFind(root.right,map,ans);

        map.put(root.val,map.get(root.val)-1);

    }
    public static void main(String[] args) {
        //build you tree and pass it as TreeNode root....
    }
}
