import java.util.ArrayList;
import java.util.HashMap;
import java.util.Map;
import java.util.Stack;

public class LC1249 {


    public static void main(String[] args) {
        String s = "))((";
        new LC1249().minRemoveToMakeValid(s);
    }

    public String minRemoveToMakeValid(String s) {
        char[] a = s.toCharArray();
        ArrayList<Character> list = new ArrayList<>();
        for (Character c : a) {
            list.add(c);
        }
        Stack<Character> stack = new Stack<>();
        for(int i = 0;i < list.size();i++){
            char cur = list.get(i);
            if(cur == '('){
                stack.push('(');
            }else if(cur == ')'){
                if(!stack.isEmpty() && stack.peek() == '('){
                    stack.pop();
                }else{
                    list.remove(i);
                    i--;
                }
            }
        }
        int reversePointer = list.size() - 1;
        while(!stack.isEmpty()){
            char me = list.get(reversePointer);
            if(me == '('){
                list.remove(reversePointer);
                stack.pop();
            }
            reversePointer --;
        }


        StringBuffer result = new StringBuffer();
        for (Character character : list) {
            result.append(character);
        }
        return result.toString();
    }
}
