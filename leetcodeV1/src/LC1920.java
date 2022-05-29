/**
 * 1920. 基于排列构建数组
 *
 * @author 21001596_ZHENGTAO YIN
 * @date 2022/04/21 16:04
 **/
public class LC1920 {

    public static void main(String[] args) {
        int [] nums = {0,2,1,5,3,4};
        int[] ans = buildArray(nums) ;
        for (int an : ans) {
            System.out.println(an);
        }
    }



    public static int[] buildArray(int[] nums) {
        int[] ans = new int [nums.length];
        for (int i = 0; i < nums.length; i++) {
            ans[i] = nums[nums[i]];
        }
        return ans;
    }

}
 