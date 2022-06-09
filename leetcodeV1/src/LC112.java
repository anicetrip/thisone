

public class LC112 {
    public boolean hasPathSum(TreeNode root, int targetSum) {
        return hasPathSumCal(root, targetSum, 0);
        
    }

    boolean hasPathSumCal(TreeNode pointer, int targetSum, int curSum){
        if(pointer == null){
            if(targetSum == curSum){
                return true;
            }else{
                return false;
            }
        }
        curSum = curSum + pointer.val;
        return hasPathSumCal(pointer.left, targetSum, curSum) || hasPathSumCal(pointer.left, targetSum, curSum);
    }
}
