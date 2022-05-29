import java.util.HashMap;
import java.util.Map;

public class LC383 {

    public static void main(String[] args) {
        String a = "aa";
        String b = "aab";
    
        boolean c = new LC383().canConstruct(a, b);
        System.out.println(c);
    }


    public boolean canConstruct(String ransomNote, String magazine) {

        if(ransomNote.length() != magazine.length()){
            return false;
        }

        Map<Character,Integer> map = new HashMap<>();
        for(char c: magazine.toCharArray()){
            if(map.containsKey(c)){
                map.put(c,map.get(c) + 1);
            }else{
                map.put(c,1);
            }
        }

        for(char c: ransomNote.toCharArray()){
            if(!map.containsKey(c)){
                return false;
            }
            int count = map.get(c);
            if(count == 1){
                map.remove(c);
            }else{
                map.put(c,map.get(c) - 1);
            }
        }
            return true;
    }
}
