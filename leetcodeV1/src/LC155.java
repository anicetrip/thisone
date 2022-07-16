import java.util.ArrayList;

import javax.xml.validation.Validator;

public class LC155 {
    public static void main(String[] args) {
        MinStack obj = new MinStack();
        obj.push(-2);
        obj.push(0);
        obj.push(-3);
        obj.getMin();
        obj.pop();
        obj.top();
        obj.getMin();
    }
}


class MinStack {
    ArrayList<Integer> a = new ArrayList<>();
    ArrayList<Integer> minList = new ArrayList<>();
    public MinStack() {

    }
    
    public void push(int val) {
        a.add(val);
        if(minList.size() == 0){
            minList.add(val);
        }else{
            int curMin = minList.get(minList.size() - 1);
            if(curMin > val){
                minList.add(val);
            }else{
                minList.add(curMin);
            }
        }

    }
    
    public void pop() {
        a.remove(a.size() - 1);
        minList.remove(minList.size() - 1);
    }
    
    public int top() {
        return a.get(a.size() - 1);
    }
    
    public int getMin() {
        return minList.get(minList.size() - 1);
    }
}