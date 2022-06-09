
public class LC226 {
    public TreeNode invertTree(TreeNode root) {



        invertTreeLoop(root);

        return root;

    }

    public void invertTreeLoop(TreeNode pointer){
        if(pointer == null){
            return;
        }
        TreeNode tmp = pointer.left;
        pointer.left = pointer.right;
        pointer.right = tmp;
        invertTreeLoop(pointer.left);
        invertTreeLoop(pointer.right);
    }
}
