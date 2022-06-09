import java.util.LinkedList;
import java.util.Queue;
import java.util.Stack;

public class LC101 {

    // [1,2,2,3,4,4,3]
    public static void main(String[] args) {
        TreeNode n1 = new TreeNode(1);
        TreeNode n2 = new TreeNode(2);
        TreeNode n3 = new TreeNode(2);
        TreeNode n4 = new TreeNode(3);
        TreeNode n5 = new TreeNode(4);
        TreeNode n6 = new TreeNode(4);
        TreeNode n7 = new TreeNode(3);
        
        n1.left = n2;
        n1.right = n3;
        n2.left = n4;
        n2.right = n5;
        n3.left = n6;
        n3.right = n7;

        boolean a = new LC101().isSymmetric(n1);
        System.out.println(a);

    }


    public boolean isSymmetric(TreeNode root) {
        if(root == null){
            return true;
        }
        if(root.left == null && root.right != null){
            return false;
        }
        if(root.left != null && root.right == null){
            return false;
        }
        Queue<TreeNode> queue = new LinkedList<>();
        queue.add(root.left);
        queue.add(root.right);
        // int currHeight = 0;
        while(!queue.isEmpty()){
            Stack<Integer> stack = new Stack<>();
            Stack<Integer> addr = new Stack<>();
            int size = queue.size();
            for(int i = 0; i< size; i ++){
                TreeNode tmp = queue.poll();
                if(stack.isEmpty()){
                    stack.add(tmp.val);
                    addr.add(i);
                }else{
                    if(stack.peek() == tmp.val){
                        if(addr.peek() + i + 1 == size){
                            stack.pop();
                            addr.pop();
                        }else{
                            return false;
                        }

                    }else{
                        stack.add(tmp.val);
                        addr.add(i);
                    }
                }
                if(tmp.left != null){
                    queue.add(tmp.left);
                }
                if(tmp.right != null){
                    queue.add(tmp.right);
                }

                // printStack(stack);
            }
            if(!stack.isEmpty()){
                return false;
            }
            // currHeight += 1;
        }
        return true;
    }



    public void printStack(Stack<?> a){
        while(!a.isEmpty()){
            System.out.print(a.pop() + " ");
        }
        System.out.println();
    }
}
