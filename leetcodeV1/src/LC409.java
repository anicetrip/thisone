import java.util.HashSet;

public class LC409 {
    public int longestPalindrome(String s) {
        HashSet<Character> set = new HashSet<Character>();
        for (Character character : s.toCharArray()) {
            if(set.contains(character)){
                set.remove(character);
            }else{
                set.add(character);
            }
            
        }
        if(set.size() == 0){
            return s.length();
        }else{
            return s.length() - set.size() + 1;
        }
    }
}
