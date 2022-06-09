public class LC334 {

    public static void main(String[] args) {
        
        int [] a = {20,100,10,12,5,13};
        // int [] a = {1,2,3,4,5};
        new LC334().increasingTriplet(a);
    }

    public boolean increasingTriplet(int[] nums) {
        if(nums.length < 3 ){
            return false;
        }
        int min = nums[0];
        int mid = Integer.MAX_VALUE;

        for (int i = 0; i < nums.length - 1; i++) {
            if(nums[i] > mid){
                return true;
            }
            if(nums[i] > min){
                mid = nums[i];
            }else{
                min = nums[i];
            }
        }
        return false;
    }
}
