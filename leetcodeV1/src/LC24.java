
public class LC24 {
    public static void main(String[] args) {
        ListNode a1 = new ListNode(1);
        ListNode a2 = new ListNode(2);
        ListNode a3 = new ListNode(3);
        ListNode a4 = new ListNode(4);
        a1.next = a2;
        a2. next = a3;
        a3.next = a4;
        new LC24().swapPairs(a1);
    }
    public ListNode swapPairs(ListNode head) {
        ListNode preHead = new ListNode(-1);
        preHead.next = head;
        ListNode cur = preHead;
        boolean second = true;
        while(cur.next != null && cur.next.next != null){
            if(cur.next != null && cur.next.next != null && second == true){
                ListNode firstNode = cur.next;
                ListNode secondNode = cur.next.next;
                firstNode.next = secondNode.next;
                cur.next = secondNode;
                secondNode.next = firstNode;
                
                
                second = false;
            }else{
                second = true;
            }
            cur = cur.next;
        }
        return preHead.next;
    }
}
