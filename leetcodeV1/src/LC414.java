
public class LC414 {

    public static void main(String[] args) {
        // int[] a = {1,2,2,5,3,5};
        int[] a = {1,-2147483648,2};
        int b = new LC414().thirdMax(a);
        System.out.println(b);
    }


    public int thirdMax(int[] nums) {
        if(nums.length == 1){
            return nums[0];
        }
        if(nums.length == 2){
            return Math.max(nums[0], nums[1]);
        }
        int max = nums[0];
        int mid = Integer.MIN_VALUE;
        int min = Integer.MIN_VALUE;
        Boolean flag = false;

        for (int num : nums) {
            if(num > max){
                if(min == mid){
                }else{
                    min = mid;
                    flag = true;
                }

                mid = max;
                max = num;
            }else if(num > mid && num < max){
                if(min == mid){
                }else{
                    min = mid;
                    flag = true;
                }
                mid = num;
                
            }else if(num >= min && num < mid){
                min = num;
                flag = true;
            }
        }
        return flag == true?min:max;
    }
}
