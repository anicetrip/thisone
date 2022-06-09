import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;

public class LC56 {

    public static void main(String[] args) {
        int [][] a = {{1,3},{2,6},{8,10},{15,18}};
        new LC56().merge(a);
    }

    public int[][] merge(int[][] intervals) {
        List<int []> list = new ArrayList<>();
        Arrays.sort(intervals,(int[] o1,int[] o2) ->{return o1[0] - o2[0];});
        int [] curGap = intervals[0];
        for(int i = 1;i < intervals.length;i++){
            if(intervals[i][0] <= curGap[1]){
                curGap[1] = Math.max(curGap[1], intervals[i][1]);
            }else{
                list.add(curGap);
                curGap = intervals[i];
            }
        }
        list.add(curGap);
        return (int[][]) list.toArray(new int[list.size()][]);
    }
}
