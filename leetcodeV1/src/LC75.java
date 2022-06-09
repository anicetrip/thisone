
public class LC75 {
    public static void main(String[] args) {
        // int[] a = {2,0,2,1,1,0};
        int[] a = {1,0,2};
        new LC75().sortColors(a);
        
    }
    public void sortColors(int[] nums) {
        if(nums.length == 0 || nums.length == 1){
            return;
        }
        if(nums.length == 2){
            int min = Math.min(nums[0], nums[1]);
            int max = Math.max(nums[0], nums[1]);
            nums[0] = min;
            nums[1] = max;
            return;
        }


        int p1 = 0;
        int p2 = nums.length - 1;
        while(nums[p1] == 0 && p1 < nums.length - 1){
            p1 ++;
        }
        while(nums[p2] == 2 && p2 > 0){
            p2 --;
        }
        if(p1 >= p2){
            return;
        }

        
        for(int p3 = p1;p3 <= p2;p3++){
            if(nums[p3] == 1){
                // p3 ++;
            }else if(nums[p3] == 0){
                int tmp = nums[p3];
                nums[p3] = nums[p1];
                nums[p1] = tmp;
                while(nums[p1] == 0 && p1 < nums.length - 1){
                    p1 ++;
                }
                p3 = p1 - 1;
            }else if(nums[p3] == 2){
                int tmp = nums[p3];
                nums[p3] = nums[p2];
                nums[p2] = tmp;
                while(nums[p2] == 2 && p2 > 0){
                    p2 --;
                }
                if(nums[p3] == 0){
                    p3 --;
                }
            }
        }

    }
}
