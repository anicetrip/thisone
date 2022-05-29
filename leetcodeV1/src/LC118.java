import java.util.ArrayList;
import java.util.List;

public class LC118 {

    public static void main(String[] args) {
        List<List<Integer>> a = new LC118().generate(5);
        for (List<Integer> list : a) {
            for (int b : list) {
                System.out.print(b);
            }
            System.out.println();
        }
    }




    public List<List<Integer>> generate(int numRows) {
        List<List<Integer>> ret = new ArrayList<List<Integer>>();
        for(int i = 0;i < numRows; i ++){
            List<Integer> line = new ArrayList<>();
            for(int j = 0;j <= i ;j++){
                if(j == 0 || j == i){
                    line.add(1);
                }else{
                    int a = ret.get(i - 1).get(j - 1);
                    int b = ret.get(i - 1).get(j);
                    line.add(a + b);
                }
            }
            ret.add(line);
        }



        return ret;
        
    }
}
