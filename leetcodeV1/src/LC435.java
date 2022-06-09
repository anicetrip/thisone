import java.util.Arrays;

public class LC435 {

    public static void main(String[] args) {
        int[][] a = {{-52,31},{-73,-26},{82,97},{-65,-11},{-62,-49},{95,99},{58,95},{-31,49},{66,98},{-63,2},{30,47},{-40,-26}};
        new LC435().eraseOverlapIntervals(a);
    }
                
    public int eraseOverlapIntervals(int[][] intervals) {
        if(intervals.length == 1 ){
            return 0;
        }
        
        Arrays.sort(intervals,(int[] a,int[] b) ->{
            return a[1] - b[1];
        });
        
        int [] tmp = intervals[0];
        int times = 1;
        for(int [] interval: intervals){
            if(interval[0] >= tmp[1]){
                times ++;
                tmp = interval;
            }
        }

        return intervals.length - times;

    }
}
