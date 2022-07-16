

public class LC707 {
    public static void main(String[] args) {
        MyLinkedList a = new MyLinkedList();
        // a.addAtHead(7);
        // a.addAtHead(2);
        // a.addAtHead(1);
        // a.addAtIndex(3,0);
        a.addAtTail(1);
        a.get(0);
    }
    
}




class MyLinkedList {
    ListNode prehead = new ListNode();
    int len = 0;

    public MyLinkedList() {
        
    }
    
    public int get(int index) {
        if(index >= len){
            return -1;
        }else{
            ListNode cur = prehead.next;
            for (int i = 0; i < index; i++) {
                cur = cur.next;
            }
            return cur.val;
        }
    }
    
    public void addAtHead(int val) {
        ListNode cur = new ListNode(val);
        ListNode tmp = prehead.next;
        prehead.next = cur;
        cur.next = tmp;
        len ++;
    }
    
    public void addAtTail(int val) {

        ListNode cur = prehead.next;
        if(cur == null){
            cur = prehead;
        }
        while(cur.next != null){
            cur = cur.next;
        }
        cur.next = new ListNode(val);
        len ++;
    }
    
    public void addAtIndex(int index, int val) {
        if(index > len){
            
        }else{
            ListNode cur = prehead;
            for (int i = 0; i < index; i++) {
                cur = cur.next;
            }
            ListNode tmp = cur.next;
            ListNode addNode = new ListNode(val);
            cur.next = addNode;
            addNode.next = tmp;
            len++;
        }
    }
    
    public void deleteAtIndex(int index) {
        if(index >= len){

        }else{
            ListNode cur = prehead;
            for (int i = 0; i < index; i++) {
                cur = cur.next;
            }
            cur.next = cur.next.next;
            len --;
        }
    }
}