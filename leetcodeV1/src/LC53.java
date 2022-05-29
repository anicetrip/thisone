


class Solution1 {


    public static void main(String[] args) {
        int [] a = {1,-2,3};
        System.out.println(new Solution1().maxSubArray1(a));
    }

    public int maxSubArray1(int[] nums) {
        int previousSum = Integer.MIN_VALUE;
        int sum = nums[0];
        int biggest_sum = nums[0];


        for(int i = 1;i< nums.length;i++){
            if(sum < 0){
                previousSum  = 0;
            }else{
                previousSum = sum;
            }
            sum = previousSum + nums[i];
            if(sum > biggest_sum){
                biggest_sum = sum;
            }
        }

        return biggest_sum;

    }












    public int maxSubArray(int[] nums) {
        int max = Integer.MIN_VALUE;
        for(int i = 0;i< nums.length;i++){
            int max_in_loop = Integer.MIN_VALUE;
            int tmp = 0;
            for(int j = i; j< nums.length;j++){
                tmp = tmp + nums[j];
                if(tmp > max_in_loop){
                    max_in_loop = tmp;
                }
            }
            if(max_in_loop > max){
                max = max_in_loop;
            }
        }
        return max;
    }
}