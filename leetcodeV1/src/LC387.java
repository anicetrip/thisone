import java.util.HashMap;
import java.util.Map;

public class LC387 {
    public int firstUniqChar(String s) {
        Map<Character,Integer[]> map = new HashMap<>();
        for (int i = 0; i < s.length(); i++) {
                char c = s.charAt(i);
                if(map.containsKey(c)){
                    Integer[] detail = map.get(c);
                    detail[0]  = detail[0 + 1];
                }else{
                    Integer [] detail = {1,i};
                    map.put(c, detail);
                }

        }

        Integer c = Integer.MAX_VALUE;
        for(Integer [] v : map.values()){
            if(v[0] == 1){
                if(c > v[1]){
                    c = v[1];
                }
            }
        }
        if(c == Integer.MAX_VALUE){
            c = -1;
        }
        return c;
    }
}
