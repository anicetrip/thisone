import java.util.ArrayList;
import java.util.HashMap;
import java.util.LinkedList;
import java.util.List;
import java.util.Map;
import java.util.Queue;

public class LC102 {
    public List<List<Integer>> levelOrder(TreeNode root) {

        List<List<Integer>> list = new ArrayList<>();
        Map<Integer,TreeNode> layerList = new HashMap<>();
        layerList.put(0, root);

        Queue<TreeNode> queue = new LinkedList<>();
        queue.add(root);

        int tmpHeight = 0;

        while(queue != null){
            TreeNode tmp = queue.poll();
            if(tmp.left != null){
                queue.add(tmp.left);
                layerList.put(tmpHeight + 1, tmp);
            }
            if(tmp.right != null){
                queue.add(tmp.right);
                layerList.put(tmpHeight + 1, tmp);
            }
        }
        List<Integer> a = new ArrayList<>();
        for (TreeNode treeNode : layerList.values()) {
            a.add(treeNode.val);
        }
        list.add(a);
        return list;
        
    }

    void orderTraversal(Queue<TreeNode> queue,int layer){
        
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