

/**
 * LC98
 */
public class LC98 {

    public boolean isValidBST(TreeNode root) {
        return check(root).isValid;
    }

    class Info{
        int min;
        int max;
        boolean isValid;
        Info(){}
        Info(boolean isValid){
            this.isValid = isValid;
        }
        Info(int min,int max,boolean isValid){
            this.min = min;
            this.max = max;
            this.isValid = isValid;
        }
    }

    Info check(TreeNode pointer){
        if(pointer == null){
            return new Info(true);
        }

        int min = pointer.val;
        int max = pointer.val;

        Info leftInfo = check(pointer.left);
        Info rightInfo = check(pointer.right);

        if(pointer.left !=  null){
            min = Math.min(min, leftInfo.min);
        }
        if(pointer.right != null){
            max = Math.max(max, rightInfo.max);
        }

        
        boolean isValid = true;

        if(pointer != null &&(leftInfo.max >= pointer.val || rightInfo.min <= pointer.val)){
            isValid = false;
        }

        return new Info(min,max,isValid);



    }

}    
