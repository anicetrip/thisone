import java.util.ArrayList;
import java.util.HashMap;
import java.util.List;
import java.util.Map;

public class LC187 {

    public static void main(String[] args) {
        // String s = "AAAAACCCCCAAAAACCCCCCAAAAAGGGTTT";
        // String s = "AAAAAAAAAAA";
        // List<String> list = new LC187().findRepeatedDnaSequences(s);
        // Map<String,Integer> map = new HashMap<>();
        // int a = map.getOrDefault("aa", 2);
        // System.out.println(a);
    }


    public List<String> findRepeatedDnaSequences(String s) {
        // int len = s.length();
        Map<String,Integer> map = new HashMap<>();
        List<String> list = new ArrayList<>();
        for(int i = 0; i <= s.length() - 10; i++){
            String sub = s.substring(i, i + 10);
            int n = map.getOrDefault(sub, 0);
            map.put(sub, n + 1);
            if(n == 1){
                list.add(sub);
            }

        }


        return list;
    }
}
