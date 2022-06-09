
import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;


public class LC15 {

    public static void main(String[] args) {
        int[] a = { -1, 0, 1, 2, -1, -4 };
        // int[] a = {-2,0,0,2,2};
        new LC15().threeSum(a);
    }

    public List<List<Integer>> threeSum(int[] nums) {
        List<List<Integer>> list = new ArrayList<>();
        Arrays.sort(nums);
        for (int i = 0; i < nums.length - 2; i++) {
            
            int target = nums[i];

            int left = i + 1;
            int right = nums.length - 1;
            

            if (left == right) {
                continue;
            }

            while (left < right) {

                while (left < right && nums[left] + nums[right] + target > 0) {
                    right--;
                }

                while (left < right && nums[left] + nums[right] + target < 0) {
                    left++;
                }
                if (left == right) {
                    break;
                }
                if (nums[left] + nums[right] + target == 0) {
                    List<Integer> curList = new ArrayList<>();
                    System.out.println(target + " " + nums[left] + " " + nums[right]);
                    curList.add(nums[i]);
                    curList.add(nums[left]);
                    curList.add(nums[right]);
                    list.add(curList);
                    left++;
                    right--;
                }

                while (left < right) {
                    if (nums[left] == nums[left - 1]) {
                        left++;
                    } else {
                        break;
                    }
                }
    
                while (left < right) {
                    if (nums[right] == nums[right + 1]) {
                        right--;
                    } else {
                        break;
                    }
                }
            }
            while (i < nums.length - 3) {
                if (nums[i] == nums[i + 1]) {
                    i++;
                } else {
                    break;
                }
            }

            

        }

        return list;
    }

    // public List<List<Integer>> threeSum(int[] nums) {
    // List<List<Integer>> list = new ArrayList<>();

    // if (nums.length < 3) {
    // return list;
    // }
    // Arrays.sort(nums);
    // int p1 = 0;
    // int p2 = nums.length - 1;
    // int p3 = 0;
    // // 处理p1
    // while (p1 != p2) {
    // if (nums[p1] > 0) {
    // break;
    // }
    // // 处理p2
    // while (p2 > p1) {
    // if(nums[p2] == nums[p2 - 1]){
    // p2 = p2 -1;
    // }
    // // 处理p3
    // p3 = p1 + 1;
    // if(p1 == p2){
    // break;
    // }
    // if(p2 == p3){
    // break;
    // }
    // while (nums[p1] + nums[p2] + nums[p3] <= 0) {
    // if (nums[p1] + nums[p2] + nums[p3] == 0) {
    // List<Integer> curList = new ArrayList<>();
    // curList.add(nums[p1]);
    // curList.add(nums[p2]);
    // curList.add(nums[p3]);
    // list.add(curList);
    // System.out.print(p1 + " " + p2 + " " +p3);
    // System.out.println(" " + nums[p1] + " " + nums[p2] + " " + nums[p3]);
    // break;
    // }
    // if (p3 > p2 - 2) {
    // break;
    // } else {
    // p3++;
    // }
    // }

    // while(p2 > 0){
    // if(nums[p2] == nums[p2 - 1]){
    // p2--;
    // }else{
    // break;
    // }
    // }
    // p2 --;

    // }
    // p2 = nums.length - 1;
    // while(p1 < p2){
    // if(nums[p1] == nums[p1 + 1]){
    // p1 ++;
    // }else{
    // break;
    // }
    // }
    // p1++;
    // }
    // return list;
    // }
    // while(p1 != p2){
    // if(nums[p1] > 0){
    // break;
    // }
    // if(-1 *(nums[p1] + nums[p2]) - nums[p1] < 0){
    // p2 = p2 - 1;
    // continue;
    // }

    // }

    // private List<Integer> sortList(int i, int j, int k){
    // int min1 = Math.min(i, j);
    // int min2 = Math.min(j, k);
    // List<Integer> list = new ArrayList<>();
    // list.add(Math.min(min1, min2));
    // list.add(Math.max(min1, min2));
    // int max1 = Math.max(i, j);
    // int max2 = Math.max(j, k);
    // list.add(Math.max(max1, max2));
    // return list;
    // }

}
