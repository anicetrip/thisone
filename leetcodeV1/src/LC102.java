import java.util.ArrayList;
import java.util.LinkedList;
import java.util.List;
import java.util.Queue;


public class LC102 {


    public static void main(String[] args) {
        TreeNode n1 = new TreeNode(1);
        TreeNode n2 = new TreeNode(2);
        TreeNode n3 = new TreeNode(3);
        TreeNode n4 = new TreeNode(4);
        n1.left = n2;
        n1.right = n3;
        n3.left = n4;

        List<List<Integer>> a = new LC102().levelOrder(n1);
        System.out.println(a);

    }


    public List<List<Integer>> levelOrder(TreeNode root) {
        List<List<Integer>> list = new ArrayList<>();
        if(root == null){
            return list;
        }
        Queue<TreeNode> queue = new LinkedList<>();
        queue.add(root);
        while(!queue.isEmpty()){
            List<Integer> layer = new ArrayList<>();
            int currentLevelSize = queue.size();
            for(int i = 0; i < currentLevelSize; i++){
                TreeNode node = queue.poll();
                layer.add(node.val);
                if(node.left != null){
                    queue.add(node.left);
                }if(node.right != null){
                    queue.add(node.right);
                }
            }
            list.add(layer);

        }
        return list;
        // List<List<Integer>> list = new ArrayList<>();
        // Map<Integer,TreeNode> layerList = new HashMap<>();
        // layerList.put(0, root);

        // Queue<TreeNode> queue = new LinkedList<>();
        // queue.add(root);

        // int tmpHeight = 0;

        // while(queue != null){
        //     TreeNode tmp = queue.poll();
        //     if(tmp.left != null){
        //         queue.add(tmp.left);
        //         layerList.put(tmpHeight + 1, tmp);
        //     }
        //     if(tmp.right != null){
        //         queue.add(tmp.right);
        //         layerList.put(tmpHeight + 1, tmp);
        //     }
        // }
        // List<Integer> a = new ArrayList<>();
        // for (TreeNode treeNode : layerList.values()) {
        //     a.add(treeNode.val);
        // }
        // list.add(a);










        
    }



}




class TreeNode {
         int val;
         TreeNode left;
         TreeNode right;
         TreeNode() {}
         TreeNode(int val) { this.val = val; }
         TreeNode(int val, TreeNode left, TreeNode right) {
             this.val = val;
             this.left = left;
             this.right = right;
         }
     }