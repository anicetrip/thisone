import java.util.ArrayList;
import java.util.LinkedList;
import java.util.List;
import java.util.Queue;
import java.util.Stack;

public class LC199 {

    public static void main(String[] args) {
        TreeNode a1 = new TreeNode(1);
        TreeNode a2 = new TreeNode(2);
        TreeNode a3 = new TreeNode(3);
        TreeNode a4 = new TreeNode(4);
        TreeNode a5 = new TreeNode(5);


        a1.left = a2;
        a1.right = a3;
        a2.right = a5;
        a3.right = a4;

        new LC199().rightSideView(a1);

    }


    public List<Integer> rightSideView(TreeNode root) {


        
        Queue<TreeNode> queue = new LinkedList<>();
        queue.add(root);
        List<Integer> list = new ArrayList<>();
        int preLineSize = 1;
        while(!queue.isEmpty()){
            int curLineSize = 0;
            
            for(int i = 0;i < preLineSize;i ++){
                TreeNode curNode = queue.poll();
                if(curNode.left != null){
                    queue.add(curNode.left);
                    curLineSize ++;
                }
                if(curNode.right != null){
                    queue.add(curNode.right);
                    curLineSize ++;
                }
                if(i == preLineSize - 1){
                    list.add(curNode.val);
                }
            }
            preLineSize = curLineSize;
        }
        return list;
    }
}
