public class LC108 {
    public static void main(String[] args) {
        int a[] = {-10,-3,0,5,9};
        TreeNode c  = new LC108().sortedArrayToBST(a);
        System.out.println(c);
    }
    public TreeNode sortedArrayToBST(int[] nums) {
        if(nums.length == 1){
            return new TreeNode(nums[1]);
        }else{
            // TreeNode preHead = new TreeNode();
            return toBST(nums, 0, nums.length - 1);
        }
        
    }

    public TreeNode toBST(int[] arr,int left, int right){
        if(left == right){
            return new TreeNode(arr[left]);
        }
        if(left > right){
            return null;
        }
        int mid = left + (right - left) / 2;
        int val = arr[mid];
        TreeNode curNod = new TreeNode(val);
        curNod.left = toBST(arr, left, mid - 1) ;
        curNod.right = toBST(arr, mid + 1, right);
        return curNod;
    }
}
