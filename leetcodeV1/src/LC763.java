
import java.util.ArrayList;
import java.util.Arrays;
import java.util.Collection;
import java.util.HashMap;
import java.util.List;

public class LC763 {
    public static void main(String[] args) {
        String s = "ababcbacadefegdehijhklijz";
        new LC763().partitionLabels(s);
    }

    public List<Integer> partitionLabels(String s) {
        HashMap<Character, int[]> map = new HashMap<Character, int[]>();
        char[] charArray = s.toCharArray();
        for (int i = 0; i < charArray.length; i++) {
            if (map.containsKey(charArray[i])) {
                int[] spread = map.get(charArray[i]);
                spread[1] = i;
            } else {
                map.put(charArray[i], new int[] { i, i });
            }
        }
        Object[] array =  map.values().toArray();
        int[][] arr = new int[array.length][2];
        for(int i = 0;i < array.length;i++){
            arr[i] = (int[])array[i];
        }

        Arrays.sort(arr, (int[] a, int[] b) -> {
            return a[0] - b[0];
        });
        ArrayList<int[]> list = new ArrayList<int[]>();
        list.add(arr[0]);
        for(int i = 1;i < arr.length;i++){
            int pointer  = list.size() - 1;
            int[] a = arr[i]; 
            if(a[0] < list.get(pointer)[1]){
                int oldValueMin = list.get(pointer)[0];
                int newValueMin = Math.min(a[0], oldValueMin);
                list.get(pointer)[0] = newValueMin; 
                int oldValueMax = list.get(pointer)[1];
                int newValueMax = Math.max(a[1], oldValueMax);
                list.get(pointer)[1] = newValueMax; 
            }else{
                list.add(a);
            }

        }

        ArrayList<Integer> resultList = new ArrayList<Integer>();
        for(int[] a : list){
            resultList.add(a[1] - a[0] + 1);
        }

        return resultList;
    }
}
