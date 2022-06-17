public class LC560 {
    public int subarraySum(int[] nums, int k) {
        int thisPositionTotalValue = 0;
        int equalAmount = 0;
        for (int i = 0; i < nums.length; i++) {
            thisPositionTotalValue += nums[i];
            int thisPositionValue = thisPositionTotalValue;
            if(thisPositionValue == k){
                equalAmount ++; 
            }
            for (int j = 0; j < i; j++) {
                thisPositionValue -= nums[j];
                if(thisPositionValue == k){
                    equalAmount ++; 
                }
            }
        }
        return equalAmount;
    }
}
