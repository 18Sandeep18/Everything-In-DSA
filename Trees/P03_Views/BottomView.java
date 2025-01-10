// package Trees.P03_Views;
// import java.util.ArrayList;
// import java.util.HashMap;
// import java.util.LinkedList;
// import java.util.Queue;



// class KK {

//     public static class TreeNode {
//         int val;
//         TreeNode left;
//         TreeNode right;
    
//         TreeNode() {
//         }
    
//         TreeNode(int val) {
//             this.val = val;
//         }
    
//         TreeNode(int val, TreeNode left, TreeNode right) {
//             this.val = val;
//             this.left = left;
//             this.right = right;
//         }
//     }

//     static class Pair{
//         TreeNode node;
//         int val;
//         Pair(TreeNode node,int val){
//             this.val = val;
//             this.node = node;
//         }
//     }
//     static ArrayList<Integer> bottomView(TreeNode root) {
//         // add your code
//         Queue<Pair> q = new LinkedList<>();
//         HashMap<Integer,TreeNode> map = new HashMap<>();
        
//         q.add(new Pair(root,0));
//         int min = Integer.MAX_VALUE;
//         int max = Integer.MIN_VALUE;
        
//         while(q.size()>0){
//             Pair p = q.remove();
//             TreeNode a = p.node;
//             int vl = p.val;
            
//             map.put(vl,a);
//             if(a.left!=null){
//                 q.add(new Pair(a.left,vl-1));
//                 min = Math.min(vl-1,min);
//             }
//             if(a.right != null){
//                 q.add(new Pair(a.right,vl+1));
//                 max = Math.max(vl+1,max);
//             }
//         }
        
//         ArrayList<Integer> arr = new ArrayList<>();
        
//         for(int i = min;i<=max;i++){
//             arr.add(map.get(i).val);
//         }
        
//         return arr;
//     }
//     public static TreeNode buildTree(String s){
//         TreeNode root = null;
//         String[] arr = 
//         if(arr[0]!=-1)root = new TreeNode(arr[0]-'0');
//         else return root;
//         Queue<TreeNode> q = new LinkedList<>();
//         q.add(root); 
//         int i = 1;

//         while(q.size()>0 && i<arr.length){
//             TreeNode cur = q.poll();
//             if(arr[i]!=-1){
//                 cur.left = new TreeNode(arr[i]-'0');
//                 q.add(cur.left);
//             }

//             i++;
//             if(i<arr.length){
//                 cur.right =  new TreeNode(arr[i]-'0');
//                 q.add(cur.right);
//             }
//             i++;
//         }


//         return root;
//     }
//     public static void main(String[] args) {
//         //build you tree and pass it as TreeNode root....
//         String s = "1 2 3 4 -1 5 6 7";
//         TreeNode root = buildTree(s);
//         ArrayList<Integer> arr = new ArrayList<>();
//         arr = bottomView(root);
//         for(int i = 0;i<arr.size();i++){
//             System.out.println(arr.get(i)+" ");
//         }

//     }
// }
