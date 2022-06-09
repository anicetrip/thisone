import java.util.LinkedList;
import java.util.Queue;


public class LC104 {

    public static void main(String[] args) {
        TreeNode n1 = new TreeNode(1);
        TreeNode n2 = new TreeNode(2);
        TreeNode n3 = new TreeNode(3);
        TreeNode n4 = new TreeNode(4);
        n1.left = n2;
        n1.right = n3;
        n3.left = n4;

        int a = new LC104().maxDepth1(n1);
        System.out.println(a);

    }


    public int maxDepth1(TreeNode root){
        if(root == null){
            return 0;
        }else{
            int leftHeight = maxDepth1(root.left);
            int rightHeight = maxDepth1(root.right);
            return Math.max(leftHeight, rightHeight) + 1;
        }
    }



    public int maxDepth(TreeNode root) {
        int maxHeight = 0;
        if(root == null){
            return maxHeight;
        }
        Queue<TreeNode> queue = new LinkedList<>();
        queue.add(root);
        while(!queue.isEmpty()){
            int currentLevelSize = queue.size();
            for(int i = 0;i < currentLevelSize;i++){
                TreeNode tmp = queue.poll();
                if(tmp.left != null){
                    queue.add(tmp.left);
                }
                if(tmp.right != null){
                    queue.add(tmp.right);
                }
            }
            maxHeight ++;
        }

        return maxHeight;
        
    }
}
