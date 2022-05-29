
import java.util.Arrays;
import java.util.HashMap;

class  LC350 {

// [2,1]
// [1,1]

    public static void main(String[] args) {
        int [] nums1 = {2,1};
        int [] nums2 = {1,1};
        int [] a = new LC350().intersect(nums1, nums2);
        for (int i : a) {
            System.out.print(i);
        }
    }




    public int[] intersect(int[] nums1, int[] nums2) {
        int l1 = nums1.length;
        int l2 = nums2.length;
        int index = 0;
        int[] intersection = new int[Math.min(l1, l2)];
        HashMap<Integer,Integer> map;
        int [] aim;
        if(l1 > l2){
            map = transfer(nums1);
            aim = nums2;
        }else{
            map = transfer(nums2);
            aim = nums1;
        }
        for (int i = 0; i < aim.length; i++) {
            if (map.containsKey(aim[i])) {
                int a = map.get(aim[i]);
                if(a == 1){
                    map.remove(aim[i]);
                }else{
                    map.put(aim[i], map.get(aim[i]) - 1);
                }
                intersection[index] = aim[i];
                index ++;
            }
        }
        return Arrays.copyOfRange(intersection, 0, index);
        
    }



    public HashMap<Integer,Integer> transfer(int[] nums){
        HashMap<Integer,Integer> map = new HashMap<>();
        for (int i : nums) {
            if(map.containsKey(i)){
                map.put(i, map.get(i) + 1);
            }else{
                map.put(i, 1);
            }
        }
        return map;
    }


}
