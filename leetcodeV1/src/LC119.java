import java.util.ArrayList;
import java.util.List;

public class LC119 {

    public static void main(String[] args) {
        new LC119().getRow(3);
    }

    public List<Integer> getRow(int rowIndex) {
        List<List<Integer>> list = new ArrayList<>();
        List<Integer> firstList = new ArrayList<>();
        firstList.add(1);
        list.add(firstList);
        for(int i = 0;i < rowIndex - 1;i++){
            List<Integer> curList = new ArrayList<>();
            curList.add(1);
            List<Integer> preList = list.get(i);
            for(int j = 0; j < i; j ++){
                int curValue = preList.get(j) + preList.get(j + 1);
                curList.add(curValue);
            }
            curList.add(1);
            list.add(curList);

            // List<Integer> curList = new ArrayList<>();
            // curList[0] = 1;
            // curList[]
        }
        return list.get(rowIndex - 1);
    }
}
